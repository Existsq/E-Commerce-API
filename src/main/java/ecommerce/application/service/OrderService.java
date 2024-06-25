package ecommerce.application.service;

import ecommerce.application.DAO.UserDAO;
import ecommerce.application.entity.OrderEntity;
import ecommerce.application.entity.UserEntity;
import ecommerce.application.repository.OrderRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class OrderService {

  private final OrderRepository orderRepository;

  public List<OrderEntity> getAllOrders() {
    return orderRepository.findAll();
  }

}
