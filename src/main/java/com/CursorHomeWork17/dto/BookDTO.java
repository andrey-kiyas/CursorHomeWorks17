package com.CursorHomeWork17.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private String id;
    private Long index;
    private String name;
    private String category;
    private String author;
    private List<String> review;
    private int rate;
}
