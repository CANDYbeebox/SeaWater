package com.sea.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by try on 2018/3/23.
 */
@Data
public class UserEntity {

    private int id;
    private String username;
    private String password;
    private String email;
    private int role_id;


    public UserEntity() {
    }

    public UserEntity(int id, String username, String password, String email, int role_id) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role_id = role_id;
    }

}
