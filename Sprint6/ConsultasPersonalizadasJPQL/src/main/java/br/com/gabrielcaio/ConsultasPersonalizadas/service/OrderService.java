package br.com.gabrielcaio.ConsultasPersonalizadas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.gabrielcaio.ConsultasPersonalizadas.entities.Order;
import br.com.gabrielcaio.ConsultasPersonalizadas.repository.OrderRepository;

@Service
public class OrderService {

	
	private OrderRepository orderRepository;

	
	public OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	public Order findById(Long id) {
		return orderRepository.findById(id).orElse(null);
	}

	public Order create(Order order) {
		return orderRepository.save(order);
	}
	public Order update(Order order) {
		return orderRepository.save(order);
	}

	public void delete(Long id) {
		orderRepository.deleteById(id);
	}
	public List<Order> getOrdersByClientName(String clientName) {
        return orderRepository.findByClientName(clientName);
    }
}
