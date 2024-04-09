package inge4.isi.projetvirtualisation.Services.impl;

import inge4.isi.projetvirtualisation.Entities.User;
import inge4.isi.projetvirtualisation.Repositories.UserRepository;
import inge4.isi.projetvirtualisation.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

   private  UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

        @Override
        public User VerifyUSerById(String email, String mdp) throws IllegalArgumentException {
            Optional<User> utilisateur = userRepository.findById(email);
            if (utilisateur.isPresent()) {
                User user = utilisateur.get();
                if (user.getMdp().equals(mdp)) {
                    System.out.println("L'utilisateur est vérifié");
                    return user;
                } else {
                    System.out.println("Mot de passe incorrect");
                    throw new IllegalArgumentException("Mot de passe incorrect");
                }
            } else {
                System.out.println("Utilisateur non trouvé");
                throw new IllegalArgumentException("Utilisateur non trouvé");
            }
        }
    }


