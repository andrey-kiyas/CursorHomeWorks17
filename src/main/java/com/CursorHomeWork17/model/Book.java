package com.CursorHomeWork17.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@ToString
@Document(collection = "books")
public class Book {
    @Id
    private String id;
    private Long index;
    private String name;
    private String category;
    private String author;
    private List<String> review;
    private int rate;

    public Book(Long index,
                String name,
                String category,
                String author,
                List<String> review,
                int rate) {
        this.name = name;
        this.index = index;
        this.category = category;
        this.author = author;
        this.review = review;
        this.rate = rate;
    }
}
