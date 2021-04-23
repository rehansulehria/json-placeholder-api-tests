package com.jsonplaceholder.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostsResponse {
    public String Post;
    public int id;
    public String title;
    public String body;
}
