package hu.IB153I16.ingatlan.service;

import hu.IB153I16.ingatlan.model.User;
import hu.IB153I16.ingatlan.model.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}