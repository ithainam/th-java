package fit.hutech.tranhuynhhainam.service;

import java.util.List;

import fit.hutech.tranhuynhhainam.model.Product;

public interface ProductService {
	List<Product> getAllProducts();
	void saveProduct(Product product);
	Product getProductById(int id);
	void deleteProductById(int id);
}
