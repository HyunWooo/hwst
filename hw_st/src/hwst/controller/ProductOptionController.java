package hwst.controller;

import hwst.domain.ProductOptionVo;
import hwst.service.ProductOptionService;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductOptionController {
	@Resource(name="productOptionService")
	private ProductOptionService productOptionService;
	
	
	    

//상품옵션전체보기(해당상품번호와 일치하는)
	@RequestMapping(value="selectProductOptionAll.do", method = RequestMethod.GET)
	public ModelAndView selectProductOptionAll(int productNo, HttpSession session, HttpServletRequest request){
		List<ProductOptionVo> list =  productOptionService.selectProductOptionAll(productNo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("productOptionList", list);	
		mv.setViewName("productOption");
		return mv;
	}
}