package com.company.userwork;

public class User {
    public String login;
    public String password;
    public String name;
    public Position role = Position.ANONYMOUS;

    public User(String login, String password, String name, Position role) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Position getRole() {
        return role;
    }
}
