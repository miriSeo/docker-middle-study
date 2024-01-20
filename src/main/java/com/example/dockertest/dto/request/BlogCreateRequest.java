package com.example.dockertest.dto.request;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogCreateRequest {

    private String title;

    private String content;



}
