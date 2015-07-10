package hwst.service;

import java.util.List;

import hwst.dao.CategoryDao;
import hwst.domain.CategoryVo;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Resource(name="categoryDao")
	private CategoryDao categoryDao;
	
	@Override
	public List<CategoryVo> selectCategory(){
		return categoryDao.selectCategory();
	}
	
	@Override
	public List<CategoryVo> selectUpCategory(){
		return categoryDao.selectUpCategory();
	}
	
}
