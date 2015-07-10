package hwst.service;

import hwst.dao.ProductDao;
import hwst.domain.ProductVo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Resource(name="productDao")
	private ProductDao productDao;
	
	@Override
	public List<ProductVo> selectProductAll() {
		return productDao.selectProductAll();
	}
	
	@Override
	public List<ProductVo> selectProductByKeyword(String keyword){
		return productDao.selectProductByKeyword(keyword);
	}
	
	@Override
	public List<ProductVo> selectProductByCategory(int categoryNo){
		return productDao.selectProductByCategory(categoryNo);
	}
	
	@Override
	public ProductVo selectProductDetails(int productNo){
		return productDao.selectProductDetails(productNo);
	}
}
