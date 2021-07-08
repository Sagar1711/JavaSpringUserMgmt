package io.project.mone.services;

import io.project.mone.domain.User;
import io.project.mone.exceptions.EtAuthException;

public interface UserService {
    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
