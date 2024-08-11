package uk.layme.cleanarchitecture.infrastructure.gateways;

import uk.layme.cleanarchitecture.domain.entity.User;
import uk.layme.cleanarchitecture.infrastructure.persistance.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObj) {
        return new UserEntity(userDomainObj.username(), userDomainObj.password(), userDomainObj.email());
    }

    User toDomainObj(UserEntity userEntity) {
        return new User(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
    }
}
