package dumbways.ways.todo.repository;

import dumbways.ways.todo.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Category findById(long id);

}
