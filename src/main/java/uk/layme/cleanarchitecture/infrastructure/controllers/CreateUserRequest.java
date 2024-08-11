package uk.layme.cleanarchitecture.infrastructure.controllers;

public record CreateUserRequest (String username,
                                 String password,
                                 String email) {
}
