package br.com.gabrielcaio.ConsultasPersonalizadas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.gabrielcaio.ConsultasPersonalizadas.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	@Query("SELECT o FROM Order o JOIN o.client c WHERE c.name = :clientName")
	List<Order> findOrderByClienteNome(@Param("clientName") String clientName);

}
