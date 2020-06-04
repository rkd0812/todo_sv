package com.kcnet.todo_sv.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDto {

    private String email;
    private String password;
}
