package com.share.share_scripts.service.link;

import com.share.share_scripts.domain.link.Link;
import com.share.share_scripts.dto.link.AddLinkRequest;
import com.share.share_scripts.dto.post.PostResponse;
import com.share.share_scripts.repository.link.LinkRepository;
import com.share.share_scripts.repository.post.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LinkService {
    private LinkRepository linkRepository;

    public Link save(AddLinkRequest request) {
        return linkRepository.save(request.toEntity());
    }

    public List<Link> findAll() { return linkRepository.findAll(); }
}
