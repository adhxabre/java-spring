package dumbways.ways.todo.repository;

import dumbways.ways.todo.entity.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Long> {

    Profile findById(long id);

}