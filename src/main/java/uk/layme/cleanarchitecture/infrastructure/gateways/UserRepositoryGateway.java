package uk.layme.cleanarchitecture.infrastructure.gateways;

import uk.layme.cleanarchitecture.application.gateways.UserGateway;
import uk.layme.cleanarchitecture.domain.entity.User;
import uk.layme.cleanarchitecture.infrastructure.persistance.UserEntity;
import uk.layme.cleanarchitecture.infrastructure.persistance.UserRepository;

public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User user) {
        UserEntity userEntity = userEntityMapper.toEntity(user);
        UserEntity createdUser = userRepository.save(userEntity);
        return userEntityMapper.toDomainObj(createdUser);
    }
}
