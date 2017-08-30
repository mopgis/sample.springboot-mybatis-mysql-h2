package cc.felix.practise.service;

import cc.felix.practise.model.Product;

public interface ProductService {

	Product selectProductById(long id);
	
	void updateProduct(Product product);
}
