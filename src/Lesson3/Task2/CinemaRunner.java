package Lesson3.Task2;

//Смоделировать покупку билетов на один сеанс в кинотеатр. Нарисовать UML диаграмму и написать классы.
//Основные сущности:
//Video (фильм): фильм содержит название, год выпуска, длительность, описание.
//HallForSession (зал кинотеатра для одного сеанса): зал состоит из мест (количество рядов и мест в ряде задается в конструкторе); место имеет 2 состояния: свободное, забронированное; объект должен предоставлять функционал бронирования места и должен подсчитывать количество купленных и свободных мест.
//MovieSession (сеанс): сеанс содержит фильм, зал для сеанса, цену билета, время начала; объект должен уметь подсчитывать итоговые сборы по сеансу.
//Клиентский класс CinemaRunner, демонстрирующий работу предыдущих классов.

import java.time.LocalDate;

public class CinemaRunner {
    public static void main(String[] args) {
        MovieSession m2 = new MovieSession(new Movie("Man X", 2008, 125, "Video about superhero"), new HallForSession("Ascold", 10, 10), 150, LocalDate.parse("2018-10-20"));

        m2.getHall().Reserved(5, 6);
        m2.getHall().Reserved(2, 4);
        m2.getHall().Reserved(7, 1);
        m2.getHall().Reserved(7, 2);
        m2.getHall().Reserved(9, 2);

        System.out.println("----------------------------------------------------------");
        System.out.println("Hall`s name - " + m2.getHall().getName());
        System.out.println(m2.getFilm());
        System.out.println("Amount of tickets sold - " + m2.getHall().SumSellTickets());
        System.out.println("Amount of tickets 'Free' - " + m2.getHall().SumFreeTickets());
        System.out.println("The sum of tickets sold - " + m2.sumMoney());
        System.out.println("-----------------------------------------------------------");
    }
}

//----------------------------------------------------------
//Hall`s name - Ascold
//Video{name='Man X', release=2008, duration=125, descripsion='Video about superhero'}
//Amount of tickets sold - 5
//Amount of tickets 'Free' - 95
//The sum of tickets sold - 750
//-----------------------------------------------------------