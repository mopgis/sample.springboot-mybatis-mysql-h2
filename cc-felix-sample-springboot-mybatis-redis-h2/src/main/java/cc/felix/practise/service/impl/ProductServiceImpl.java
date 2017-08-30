package cc.felix.practise.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.felix.practise.mapper.ProductMapper;
import cc.felix.practise.model.Product;
import cc.felix.practise.service.ProductService;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class ProductServiceImpl implements ProductService {

	@Autowired
	@Setter
	@Getter
	private ProductMapper productMapper; 
	
	@Override
	public Product selectProductById(long id) {
		log.debug("select by id: " + id);
		return productMapper.select(id);
	}

	@Override
	public void updateProduct(Product product) {
		log.debug("update Product :" + product);
		productMapper.update(product);
	}

}
