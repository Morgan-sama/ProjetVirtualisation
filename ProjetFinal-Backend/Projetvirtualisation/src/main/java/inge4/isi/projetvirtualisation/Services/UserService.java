package inge4.isi.projetvirtualisation.Services;

import inge4.isi.projetvirtualisation.Entities.User;

public interface UserService {

    User createUser(User user);

    User VerifyUSerById(String email, String mdp)throws IllegalArgumentException;
}
