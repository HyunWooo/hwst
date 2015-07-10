package hwst.service;

import hwst.domain.ProductVo;

import java.util.List;

public interface ProductService {

	List<ProductVo> selectProductAll();
	List<ProductVo> selectProductByKeyword(String keyword);
	List<ProductVo> selectProductByCategory(int categoryNo);
	ProductVo selectProductDetails(int productNo);
}
