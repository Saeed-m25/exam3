package com.example.exam2.Model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Teacher {
   @NotNull(message = "all should not be empty")
    private int id;
   @NotEmpty(message = "all should not be empty")
   private String name;
   @NotNull(message = "all should not be empty")
   private int salary;
}
