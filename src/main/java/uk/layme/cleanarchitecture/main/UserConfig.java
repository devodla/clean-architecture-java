package uk.layme.cleanarchitecture.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uk.layme.cleanarchitecture.application.gateways.UserGateway;
import uk.layme.cleanarchitecture.application.usecases.CreateUserInteraction;
import uk.layme.cleanarchitecture.infrastructure.controllers.UserDTOMapper;
import uk.layme.cleanarchitecture.infrastructure.gateways.UserEntityMapper;
import uk.layme.cleanarchitecture.infrastructure.gateways.UserRepositoryGateway;
import uk.layme.cleanarchitecture.infrastructure.persistance.UserRepository;

@Configuration
public class UserConfig {

    @Bean
    CreateUserInteraction createUserCase(UserGateway userGateway) {
        return new CreateUserInteraction(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}
