package ecommerce.application.controller;

import ecommerce.application.DAO.OrderDAO;
import ecommerce.application.service.OrderService;
import ecommerce.application.service.UserService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
@AllArgsConstructor
public class Controller {

  UserService userService;
  OrderService orderService;

  @GetMapping("/orders")
  public List<OrderDAO> getAllOrders() {
    return orderService.getAllOrders().stream()
        .map(
            orderEntity ->
                OrderDAO.builder()
                    .id(orderEntity.getId())
                    .price(orderEntity.getPrice())
                    .description(orderEntity.getDescription())
                    .product_name(orderEntity.getProduct_name())
                    .build())
        .toList();
  }

  // GET /order/{id}
  // GET /orders
  // GET /orders/{user_id}
  // POST /order
  // POST /order

}
