package cc.felix.practise.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import cc.felix.practise.model.Product;

@Component
@Mapper
public interface ProductMapper {

	@Select("select * from product where id = #{id}")
	Product select(@Param("id") long id);
	
	@Select("update product(name,price) values(#{name},#{price}) where id = #{id}")
	void update(Product product);
}
