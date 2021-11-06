package com.company;

import com.company.userwork.Position;
import com.company.userwork.Store;
import com.company.userwork.User;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User bot1 = new User("Bob", "1234", "Vasya", Position.DIRECTOR);
        User bot2 = new User("Admin", "1111", "Oleg", Position.ADMINISTRATOR);
        User bot3 = new User("Wolf", "2222", "Petya", Position.MANAGER);
        User bot4 = new User("Fox", "3333", "Sonya", Position.CLIENT);
        User bot5 = new User("Anim", "0000", "Dima", Position.ANONYMOUS);

        User[] arr = {bot1, bot2, bot3, bot4, bot5};

        Store str1 = new Store("ATB", "http/atb.com", arr, bot1);
        System.out.println();

        boolean b = true;
        while(b){
            tryLogin(str1);
        }

    }


   public static void tryLogin(Store store){
        System.out.print("Введите логин: ");
        Scanner scn1 = new Scanner(System.in);
        String login = scn1.nextLine();
        System.out.print("Введите пароль: ");
        Scanner scn2 = new Scanner(System.in);
        String password = scn2.nextLine();
        store.logIn(login, password);
        store.getCurrentUserRights();
        store.logOut();

    }
}
