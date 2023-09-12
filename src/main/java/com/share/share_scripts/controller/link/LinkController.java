package com.share.share_scripts.controller.link;

import com.share.share_scripts.domain.link.Link;
import com.share.share_scripts.dto.link.AddLinkRequest;
import com.share.share_scripts.service.link.LinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class LinkController {
    private final LinkService linkService;

    @PostMapping("/api/link")
    public ResponseEntity<Link> addLink(@RequestBody AddLinkRequest request) {
        Link savedLink = linkService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedLink);
    }
}
