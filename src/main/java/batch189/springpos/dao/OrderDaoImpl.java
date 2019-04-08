package batch189.springpos.dao;


import org.springframework.stereotype.Repository;

import batch189.springpos.model.Order;

@Repository
public class OrderDaoImpl extends AbstractHibernateDao<Order> implements OrderDao {

	public OrderDaoImpl () {
		setClazz(Order.class);
	}

}
