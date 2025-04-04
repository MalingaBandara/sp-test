package com.bitlord.news.news.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @Column( name = "Categories_Id")
    private Long id;

    private String categoryName;

    @ManyToOne
    @JoinColumn(name="news_id")
    @JsonBackReference  //  Prevents infinite recursion
    private News news;

}
