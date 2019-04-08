package batch189.springpos.service;

import java.util.Collection;

import batch189.springpos.model.Order;
import batch189.springpos.modelview.OrderModelView;

public interface OrderService {

	public Order findOne(String id);
	public Collection<Order> findAll();
	public Order update(Order order);
	public void delete(Order order);
	public void deleteById(String id);
	public void save(OrderModelView orderModelView);
}
