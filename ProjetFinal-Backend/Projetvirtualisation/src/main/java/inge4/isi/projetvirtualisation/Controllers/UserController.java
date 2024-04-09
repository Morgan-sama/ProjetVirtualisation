package inge4.isi.projetvirtualisation.Controllers;

import inge4.isi.projetvirtualisation.Entities.User;
import inge4.isi.projetvirtualisation.Services.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("User")
@CrossOrigin("http://localhost:4200")
public class UserController {
    private UserService userService;

    @PostMapping("addUser")
    public ResponseEntity<User> createEtudiant (@RequestBody User user){
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("login")
    public ResponseEntity<User> login(@RequestParam String email, @RequestParam String mdp ){

        User userLogged = userService.VerifyUSerById(email, mdp);
        return new ResponseEntity<>(userLogged, HttpStatus.OK);
    }


}
