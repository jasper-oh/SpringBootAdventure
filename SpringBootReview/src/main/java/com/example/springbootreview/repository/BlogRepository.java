package com.example.springbootreview.repository;

import com.example.springbootreview.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
