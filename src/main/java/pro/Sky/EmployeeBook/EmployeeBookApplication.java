package pro.Sky.EmployeeBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//        Шаг 1
//        Подключите к вашему проекту из прошлых домашних заданий (книге сотрудников) библиотеку commons-lang3 (с помощью Maven).
//
//        Шаг 2
//        Реализуйте проверку всех входящих от пользователя текстовых данных (имена сотрудников и фамилии) с помощью класса StringUtils.
//        Если проверка не пройдена, выбросить исключение, возвращающее статус 400 Bad Request.
//
//        Шаг 3
//        Если данные прошли проверку, убедиться, что имя и фамилия будут записаны в сотрудника с большой буквы.

@SpringBootApplication
public class EmployeeBookApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeBookApplication.class, args);
    }

}
