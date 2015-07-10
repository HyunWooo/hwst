package hwst.controller;

import hwst.domain.CategoryVo;
import hwst.domain.ProductVo;
import hwst.service.CategoryService;
import hwst.service.ProductService;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

	@Resource(name="categoryService")
    private CategoryService categoryService;
	
	@Resource(name="productService")
	private ProductService productService;
	
	
	 @RequestMapping(value="index.do")
	    public String index(HttpSession session){
		 	List<CategoryVo> upCategoryList = categoryService.selectUpCategory();
		 	List<CategoryVo> categoryList = categoryService.selectCategory();
		 	List<ProductVo> productList =  productService.selectProductAll();
	    	
	    	System.out.println(upCategoryList);
	    	System.out.println(categoryList);
	    	System.out.println(productList);
	    	
	    	session.setAttribute("upCategoryList", upCategoryList);
	    	session.setAttribute("categoryList", categoryList);
	    	session.setAttribute("productList", productList);
	    	
	    	return "index";
	    }

}
