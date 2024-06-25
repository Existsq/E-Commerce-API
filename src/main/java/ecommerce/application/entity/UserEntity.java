package ecommerce.application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(unique = true, nullable = false)
  Integer id;

  @Column(nullable = false)
  Integer earnings;

  @Column Integer orders;

  @Column Integer products;
}
