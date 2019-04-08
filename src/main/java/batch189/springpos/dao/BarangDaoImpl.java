package batch189.springpos.dao;


import java.util.Collection;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import batch189.springpos.model.Barang;

@Repository
public class BarangDaoImpl extends AbstractHibernateDao<Barang> implements BarangDao {

	public BarangDaoImpl () {
		setClazz(Barang.class);
	}

	public Collection<Barang> searchByNama(final String nama) {
		String hql = "FROM Barang B WHERE LOWER(B.nama) LIKE LOWER(:nama)";
		Query q = getCurrentSession().createQuery(hql);
		q.setParameter("nama", "%" + nama + "%");

		Collection<Barang> result = q.list();
		return result;
	}
	
	public Collection<Barang> searchByHarga(final long harga, final long harga2 ) {
		String hql = "FROM Barang B WHERE B.harga > :harga AND B.harga < :harga2" ; 
		Query q = getCurrentSession().createQuery(hql);
		q.setParameter("harga", harga); 
		q.setParameter("harga2", harga2); 
		Collection<Barang> result = q.list();
		return result;
	}
	
}
