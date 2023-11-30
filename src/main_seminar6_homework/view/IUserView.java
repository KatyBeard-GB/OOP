package main_seminar6_homework.view;

import main_seminar3.data.User;

import java.util.List;

// Пример использования принципа ISP
public interface IUserView<T extends User> {
    void sendOnConsole(List<T> list);
}
