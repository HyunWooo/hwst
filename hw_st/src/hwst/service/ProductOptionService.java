package hwst.service;

import hwst.domain.ProductOptionVo;

import java.util.List;

public interface ProductOptionService {

	List<ProductOptionVo> selectProductOptionAll(int productNo);
}
