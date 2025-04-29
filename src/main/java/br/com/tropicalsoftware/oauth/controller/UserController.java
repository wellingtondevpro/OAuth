package br.com.tropicalsoftware.oauth.controller;

import br.com.tropicalsoftware.oauth.entities.UserDTO;
import br.com.tropicalsoftware.oauth.service.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    public ResponseEntity<?> UserController(@RequestBody UserDTO dto){
        return ResponseEntity.ok(userService.saveUser(dto));
    }
}
