package br.com.latanks.todolist.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserModel {

    public String username;

    public String name;

    public String password;
}
