package com.quicksale.datafetch.DTOs;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Traits {
    String gameid;
    String projectname;
    String typeclass;
    String season;
    @JsonProperty("attributes\\n/\\nPlanting\\nLocation")
    String attributesPlantingLocation;
    @JsonProperty("attributes\\n/\\nForest\\nType")
    String attributesForestType;
    String tag;
    String fullname;
    int traitcount;
    @JsonProperty("attributes\\n/\\nPartne")
    String attributesPartne;
    String rarity;
}
