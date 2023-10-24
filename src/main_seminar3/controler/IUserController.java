package main_seminar3.controler;

import main_seminar3.data.User;

public interface IUserController <T extends User>{
    void create(String firstName, String secondName, String lastName);
}
