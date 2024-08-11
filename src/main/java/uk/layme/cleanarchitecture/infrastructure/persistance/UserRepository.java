package uk.layme.cleanarchitecture.infrastructure.persistance;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
