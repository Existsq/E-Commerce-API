package ecommerce.application.DAO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@AllArgsConstructor
@Getter
public class UserDAO {

  Integer id;
  Integer earnings;
  Integer orders;
  Integer products;
}
