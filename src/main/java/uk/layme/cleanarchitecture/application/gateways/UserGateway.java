package uk.layme.cleanarchitecture.application.gateways;

import uk.layme.cleanarchitecture.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
