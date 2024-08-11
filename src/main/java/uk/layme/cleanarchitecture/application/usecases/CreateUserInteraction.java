package uk.layme.cleanarchitecture.application.usecases;

import uk.layme.cleanarchitecture.application.gateways.UserGateway;
import uk.layme.cleanarchitecture.domain.entity.User;

public class CreateUserInteraction {

    private final UserGateway userGateway;

    public CreateUserInteraction(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}
