package dumbways.ways.todo.repository;

import dumbways.ways.todo.entity.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    Todo findById(long id);

}
