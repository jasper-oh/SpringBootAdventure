package com.example.springbootreview.service;

import com.example.springbootreview.domain.Article;
import com.example.springbootreview.dto.AddArticleRequest;
import com.example.springbootreview.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;


    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
