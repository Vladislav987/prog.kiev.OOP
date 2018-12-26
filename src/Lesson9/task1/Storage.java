package Lesson9.task1;

import java.util.Optional;

public interface Storage<T extends Entity<ID>, ID> {
    Optional<T> findById(ID id);

    void save(T entity);

    void deleteById(ID id);

}
