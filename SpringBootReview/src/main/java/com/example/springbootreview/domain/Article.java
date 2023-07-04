package com.example.springbootreview.domain;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
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

    protected Article(){

    }

    /**
     * Getters
     *
     * @return id , title, content
     */
    public Long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getContent(){
        return content;
    }
}
