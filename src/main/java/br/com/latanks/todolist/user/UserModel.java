package br.com.latanks.todolist.user;

public class UserModel {

    public String username;

    public String name;

    public String password;

    @Override
    public String toString() {
        return "UserModel [username=" + username + ", name=" + name + ", password=" + password + "]";
    }
}
