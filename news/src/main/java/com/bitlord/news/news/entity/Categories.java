package com.bitlord.news.news.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table( name = "Categories")
@AllArgsConstructor
@NoArgsConstructor
public class Categories {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    private String categoryName;

    @ManyToOne
    @JoinColumn(name="news_id")
    private News news;

}
