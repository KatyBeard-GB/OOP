package main_seminar6_homework.service;

import main_seminar3.data.User;

import java.util.List;

public interface IUserService<T extends User> {
    void create(String firstName, String secondName, String lastName);
    List<T> getAll();
}
