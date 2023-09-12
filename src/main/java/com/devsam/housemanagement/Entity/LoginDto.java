package com.devsam.housemanagement.Entity;
//DTO classes to transfer data or payload between client and server and vice-versa.
import lombok.Data;

@Data
public class LoginDto {
    private String username;
    private String password;
}