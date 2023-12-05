package com.User.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JwtRequest {
    private String email;
    private String password;
}

