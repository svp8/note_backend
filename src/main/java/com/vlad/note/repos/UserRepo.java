package com.vlad.note.repos;

import com.vlad.note.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
    User findByLogin(String login);
}
