package ecommerce.application.service;


import ecommerce.application.DAO.UserDAO;
import ecommerce.application.repository.UserRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

  private final UserRepository userRepository;



}
