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
public class Tokens {
    {
        int reports;
        Traits traits;
        String policy_id;
        String initial_mint_tx_hash;
        String bundle_display_names;
        String created_at;
        String asset_id;
        String source;
        String optimized_source;
        String asset_name;
        String media_type;
        Collections[] collections;
        String fingerprint;
        int asset_num;
        int views;
        int likes;
        String listed_at;
        int quantity;
        String bundled_assets;
        boolean has_pending_transaction;
        String listing_lovelace;
        String listing_type;
        String display_name;
        String main_bundle_item;
        String bundle_size;
        String is_taken_down;
    }
}
