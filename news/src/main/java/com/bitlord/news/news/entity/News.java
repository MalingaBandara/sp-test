package com.bitlord.news.news.entity;



import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table( name = "News")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class News {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    private String news;

    // One-to-Many relationship with Categories
    @OneToMany(mappedBy = "news", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JsonManagedReference  // Prevents infinite recursion
    private List<Categories> categories = new ArrayList<>();

}
