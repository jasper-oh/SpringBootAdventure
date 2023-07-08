package com.example.springbootreview.service;

import com.example.springbootreview.domain.Article;
import com.example.springbootreview.dto.AddArticleRequest;
import com.example.springbootreview.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor // Add the constructor field that contain the final
@Service //Register to Bean
public class BlogService {

    private final BlogRepository blogRepository;


    /**
     * Method that
     * Write the Blog article.
     * @param request
     * @return
     */
    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
