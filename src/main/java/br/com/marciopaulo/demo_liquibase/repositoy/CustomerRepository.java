package br.com.marciopaulo.demo_liquibase.repositoy;

import br.com.marciopaulo.demo_liquibase.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
