package dumbways.ways.todo.repository;

import dumbways.ways.todo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findById(long id);

}
