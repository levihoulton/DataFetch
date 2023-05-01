package com.quicksale.datafetch.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Collections {
    int reports;
    String _index;
    String policy_id;
    String global_floor_lovelace;
    Boolean nsfw;
    String description;
    String created_at;
    String source;
    String display_name;
    Boolean is_verified;
    int supply;
    String url;
    String jpg_floor_lovelace;
    Boolean is_minting;
    Boolean is_rugpull;
    String hero_image;
    String optimized_source;
    String state_of_project;
    String global_volume_lovelace_all_time;
    String _id;
    int jpg_volume_lovelace_24h;
    boolean is_taken_down;
    int likes;
}
