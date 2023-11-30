package main_seminar6_homework.controler;

import main_seminar3.data.User;

// Пример использования принципов LSP и ISP
public interface IUserController <T extends User>{
    void create(String firstName, String secondName, String lastName);
}
