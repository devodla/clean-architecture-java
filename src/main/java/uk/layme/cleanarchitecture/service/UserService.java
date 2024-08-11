package uk.layme.cleanarchitecture.service;

import org.springframework.stereotype.Service;
import uk.layme.cleanarchitecture.model.User;
import uk.layme.cleanarchitecture.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User user) {
        return userRepository.save(user);
    }
}
