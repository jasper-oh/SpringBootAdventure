package com.example.springbootreview.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", updatable = false)
    private Long id;
    @Column(name="title", nullable = false)
    private String title;

    @Column(name="content", nullable = false)
    private String content;


    /**
     * Builder Annotation : Lombok provide this annotation.
     * If we use this annotation above the constructor, we can create the object by the builder pattern.
     *
     * Builder pattern -> One of the design pattern
     * Short Description of Builder Pattern :
     *
     * new Article("ABC","def") -> if we didn't use builder pattern
     *
     * Article.builder()
     *          .title("ABC")
     *          .content("def")   -> If we use builder pattern
     *          .build()
     * @param title
     * @param content
     */
    @Builder
    public Article(String title, String content){
        this.title = title;
        this.content = content;
    }

}
