package batch189.springpos.dao;

import java.util.Collection;

import batch189.springpos.model.Barang;

public interface BarangDao {

	public Barang findOne(String id);
	public Collection<Barang> findAll();
	public void delete(Barang barang);
	public void deleteById(String id);
	public Barang update(Barang barang);
	public void save(Barang barang);
	public Collection<Barang> searchByNama(String nama);
	public Collection<Barang> searchByHarga(long harga,long harga2);
}
