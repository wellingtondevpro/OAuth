package br.com.tropicalsoftware.oauth.service;

import br.com.tropicalsoftware.oauth.entities.User;
import br.com.tropicalsoftware.oauth.entities.UserDTO;
import br.com.tropicalsoftware.oauth.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String saveUser(UserDTO dto){

        var entity = new User(
                dto.userName(),
                dto.password()
        );

        return userRepository.save(entity).getUserName();
    }
}
