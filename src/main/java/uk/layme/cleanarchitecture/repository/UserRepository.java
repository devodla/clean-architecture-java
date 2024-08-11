package uk.layme.cleanarchitecture.repository;

import org.springframework.data.repository.CrudRepository;
import uk.layme.cleanarchitecture.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
