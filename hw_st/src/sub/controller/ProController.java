package sub.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.domain.ProVo;
import model.service.ProService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProController {

	@Resource(name="pService")
    private ProService pService;
	
	@RequestMapping(value="selectPro", method = RequestMethod.GET)
	public ModelAndView selectFestival(HttpSession session, HttpServletRequest request){
		List<ProVo> list =  pService.pSelect();
		System.out.println(list);
		session.setAttribute("proList", list);
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);	
		mv.setViewName("redirect:shop.jsp?pg=1");	
		return mv;
	}

}
