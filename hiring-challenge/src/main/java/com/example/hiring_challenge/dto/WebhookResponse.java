package com.example.hiring_challenge.dto;

import lombok.Data;

@Data
public class WebhookResponse {
    private String webhook;
    private String accessToken;
}
