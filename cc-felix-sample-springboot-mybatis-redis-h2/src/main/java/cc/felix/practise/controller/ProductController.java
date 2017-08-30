package cc.felix.practise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cc.felix.practise.model.Product;
import cc.felix.practise.service.ProductService;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/product")
@Log4j
public class ProductController {

	@Autowired
	@Setter
	@Getter
	private ProductService productService;
	
	@GetMapping("/{id}")
	public Product getProductInfo(@PathVariable("id") Long productId){
		return productService.selectProductById(productId.longValue());
	}
	
	@PutMapping("/{id}")
	public void updateProductInfo(@RequestBody Product newProduct){
		productService.updateProduct(newProduct);
	}
}
