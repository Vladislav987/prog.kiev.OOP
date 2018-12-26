package Lesson9.task1;

//Задан интерфейс хранилища продуктов:
//public interface ProductStorage {
//   Optional<Product> findById(long id);
//   void save(Product product);
//   void deleteById(long id);
//}
//
//Объект типа ProductStorage хранит объекты Product (id, название, описание, цена) и предоставляет базовые
// операции по доступу к объектам (поиск по id, сохранение продукта, удаление по id).
//Написать класс MapProductStorage, который реализует интерфейс ProductStorage с использованием HashMap.
// Все операции из интерфейса должны выполняться за константное время O(1).
//Написать обобщенную реализацию хранилища.

public interface Entity<ID> {
    ID getId();
}
