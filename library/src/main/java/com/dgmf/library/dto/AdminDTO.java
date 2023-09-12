package com.dgmf.library.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class AdminDTO {
    @Size(min = 3, max = 10, message = "Invalid First Name (3-10 characters)")
    private String firstName;
    @Size(min = 3, max = 10, message = "Invalid Last Name (3-10 characters)")
    private String lastName;
    private String username;
    @Size(min = 5, max = 15, message = "Invalid Password (3-15 characters)")
    private String password;
    private String repeatedPassword;
}
