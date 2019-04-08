package batch189.springpos.dao;


import org.springframework.stereotype.Repository;

import batch189.springpos.model.OrderDetail;

@Repository
public class OrderDetailDaoImpl extends AbstractHibernateDao<OrderDetail> implements OrderDetailDao {

	public OrderDetailDaoImpl () {
		setClazz(OrderDetail.class);
	}

}
