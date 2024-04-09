package inge4.isi.projetvirtualisation.Repositories;

import inge4.isi.projetvirtualisation.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, String> {

}
