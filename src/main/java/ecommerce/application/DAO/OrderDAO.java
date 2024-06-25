package ecommerce.application.DAO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@AllArgsConstructor
@Getter
public class OrderDAO {

  Integer id;
  String product_name;
  Integer price;
  String description;
}
