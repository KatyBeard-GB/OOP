package main_seminar3.view;

import main_seminar3.data.User;

import java.util.List;

public interface IUserView<T extends User> {
    void sendOnConsole(List<T> list);
}
