package uk.layme.cleanarchitecture.infrastructure.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uk.layme.cleanarchitecture.application.usecases.CreateUserInteraction;
import uk.layme.cleanarchitecture.domain.entity.User;

@RestController
public class UserController {

    private final CreateUserInteraction createUserInteraction;
    private final UserDTOMapper userDTOMapper;

    public UserController(CreateUserInteraction createUserInteraction, UserDTOMapper userDTOMapper) {
        this.createUserInteraction = createUserInteraction;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping
    CreateUserResponse createUser(@RequestBody CreateUserRequest request) {
        User userBusinessObj = userDTOMapper.toUser(request);
        User createdUser = createUserInteraction.createUser(userBusinessObj);
        return userDTOMapper.toResponse(createdUser);
    }
}
