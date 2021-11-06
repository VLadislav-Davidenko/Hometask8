package com.company.userwork;

import java.lang.reflect.Array;
import java.util.Objects;

public class Store {

    public String name;
    public String url;
    public  User [] arr ;
    public User current;

    public Store(String name, String url, User[] arr, User current) {
        this.name = name;
        this.url = url;
        this.arr = arr;
        this.current = current;
    }

    public boolean logIn(String name, String password){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].login.equals(name) && arr[i].password.equals(password)){
                current = arr[i];
                System.out.println("TRUE");
                return true;
            }
        } System.out.println("FALSE");
        return false;
    }

    public void getCurrentUserRights(){
        switch (current.role){
            case DIRECTOR -> System.out.println("Директор магазина, может управлять кадрами, и ценами");
            case ADMINISTRATOR -> System.out.println("Администратор магазина, может добавлять товары и редактировать их описание");
            case MANAGER -> System.out.println("Менеджер магазина, может общаться с клиентами");
            case CLIENT -> System.out.println("Клиент магазина, может покупать товары и пользоваться дисконтом");
            case ANONYMOUS -> System.out.println("Анонимный пользователь, может покупать товары и\\или авторизоваться");

        }
    }

    public void logOut(){
        current = null;
        System.out.println("Пользователь вышел из системы");
    }


}
