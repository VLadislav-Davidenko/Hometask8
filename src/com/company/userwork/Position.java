package com.company.userwork;

public enum Position {
    DIRECTOR("Директор"),
    ADMINISTRATOR("Администратор"),
    MANAGER("Менеджер"),
    CLIENT("Клиент"),
    ANONYMOUS("Аноним");

    private String pos;

    Position(String pos) {
        this.pos = pos;
    }

    public String getPos() {
        return pos;
    }

}
