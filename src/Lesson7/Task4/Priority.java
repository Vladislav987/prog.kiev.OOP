package Lesson7.Task4;

//Смоделировать менеджер задач, предоставляющий гибкую систему сортировки и фильтрации задач.
//Основные сущности:
//Задача (Task1).
//Свойства: id, название, описание, дедлайн, приоритет (MINOR, NORMAL, MAJOR).
//Список задач (Tasks).
//Свойства: список задач.
//Методы: сортировка по компаратору, фильтрация по предикату.
//Компараторы для задач (TaskComparators) - содержит статические фабричные методы (static factory methods) для создания компараторов.
//Для сортировки задач по имени.
//Для сортировки задач по дедлайну.
//Для сортировки задач по приоритету.
//Предикаты для задач (TaskPredicates) - содержит статические фабричные методы (static factory methods) для создания предикатов.
//Для нахождения задач по части имени.
//Для нахождения задач с истекшим дедлайном.
//Для нахождения задач с заданному приоритету.
//Клиентский класс TasksRunner: протестировать функционал предыдущих классов.

public enum Priority {
    MINOR,
    NORMAL,
    MAJOR
}