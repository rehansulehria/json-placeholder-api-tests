package com.jsonplaceholder.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostsResponse {
    @JsonProperty("userId")
    int userId;

    @JsonProperty("id")
    public int id;

    @JsonProperty("title")
    String title;

    @JsonProperty("body")
    String body;
}
