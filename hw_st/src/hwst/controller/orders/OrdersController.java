package hwst.controller.orders;

import hwst.domain.orders.OrdersEnum.DeliveryStat;
import hwst.domain.orders.OrdersEnum.OrderStat;
import hwst.domain.orders.OrdersVo;
import hwst.domain.users.BuyerVo;
import hwst.domain.users.SellerVo;
import hwst.domain.users.Grade;
import hwst.domain.users.UserSection;
import hwst.domain.users.UsersVo;
import hwst.service.orders.OrdersService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrdersController {

	Logger logger = Logger.getLogger(this.getClass());
	
	@Resource(name="ordersService")
    private OrdersService ordersService;
	
	//주문등록
	@RequestMapping(value="insertOrders.do", method = RequestMethod.POST)
	public ModelAndView insertOrders(HttpSession session, HttpServletRequest request,
			@RequestParam("productOptionNo") List<Integer> productOptionNo, 
			@RequestParam("buyAmount") List<Integer> buyAmount,
			@RequestParam("totalPrice") List<Integer> totalPrice,
			@RequestParam(value="deletedCart", required=false) List<Integer> deletedCart,
			String receiverName, String phone, String postCode, String address, 
			 int userNo,	Grade grade, String message,	String allTotalPrice,
			String discountPrice, String discountedTotalPrice, int checkoutInfo){
		
		
		boolean stat = false;
		
		try {
			String fromCart = (String)session.getAttribute("productViewStat");
			OrdersVo ordersVo = new OrdersVo(userNo, receiverName, phone, postCode, address, message, grade, allTotalPrice, discountPrice, discountedTotalPrice);
			stat = ordersService.insertOrders(ordersVo,productOptionNo, buyAmount, totalPrice, deletedCart, checkoutInfo, fromCart);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:orderComplete.do");
		session.setAttribute("insertOrdersStat", stat);
		
		return mv;
	}

	//해당 userNo의 주문내역을 조회
	@RequestMapping(value="orderManagement.do")
    public ModelAndView selectOrdersAll(HttpSession session, HttpServletRequest request){
		List<OrdersVo> list = null;
		Map<Integer, Integer> groupCountMap = new HashMap<Integer, Integer>();
		ModelAndView mv = new ModelAndView();
		UsersVo vo = (UsersVo)session.getAttribute("userLoginInfo");
		
		if(vo==null){
			mv.setViewName("users/login");
			return mv;
		}
		logger.info("안녕하세요! userNo "+ vo.getUserNo() + "입니다.");
		
		try {
			list = ordersService.selectOrdersAll(vo);
			groupCountMap = ordersService.selectOrderGroupCount(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("안녕하세요!"+ groupCountMap + "입니다.");
		
		
		mv.addObject("groupCountMap", groupCountMap);
		mv.addObject("list", list);
		
		//구매자,판매자별로 setViewName 분기해야됨
		if(vo.getUserSection() == UserSection.BUYER){
			mv.setViewName("/orders/buyerOrderManagement");
		}
		else if(vo.getUserSection() == UserSection.SELLER){
			mv.setViewName("/orders/sellerOrderManagement");
		}
		
		return mv;
	}
	
	//해당 OrderNo의 주문상태를 변경
	@RequestMapping(value="updateOrderStat.do", method = RequestMethod.POST)
    public ModelAndView updateOrderStat(int orderNo, OrderStat orderStat, HttpSession session, HttpServletRequest request){
		boolean stat=false;
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("common/404");
		
		try {
			stat = ordersService.updateOrderStat(orderNo,orderStat);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(stat){
				mv.setViewName("redirect:orderManagement.do");
		}
		return mv;
	}

	
	//해당 OrderNo의 주문상태를 변경
	@RequestMapping(value="udtDeliveryStat.do", method = RequestMethod.POST)
    public ModelAndView udtDeliveryStat(int orderNo, int productOptionNo, DeliveryStat deliveryStat, HttpSession session, HttpServletRequest request)throws Exception{
		boolean stat=false;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("common/404");
		UsersVo usersVo = (UsersVo) session.getAttribute("userLoginInfo");
		switch(usersVo.getUserSection()){
		case BUYER:
			usersVo = (BuyerVo) session.getAttribute("userLoginInfo");
			stat = ordersService.udtDeliveryStat(orderNo,productOptionNo,deliveryStat, ((BuyerVo) usersVo).getGrade(), usersVo.getUserNo());
			break;
		case SELLER:
			usersVo = (SellerVo) session.getAttribute("userLoginInfo");
			stat = ordersService.udtDeliveryStatS(orderNo,productOptionNo,deliveryStat);
			break;
		default:
			break;
		}
		if(stat){
				mv.setViewName("redirect:orderManagement.do");
		}
		return mv;
	}
	
	
	//해당 OrderNo의 주문을 삭제
	@RequestMapping(value="deleteOrder.do", method = RequestMethod.POST)
    public ModelAndView deleteOrder(int orderNo, HttpSession session, HttpServletRequest request){
		boolean stat=false;
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("common/404");
		
		try {
			stat = ordersService.deleteOrder(orderNo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(stat){
			mv.setViewName("redirect:orderManagement.do");
		}
		
		return mv;
	}
	
	
	
	
	
	
	
	
	@RequestMapping(value="orderComplete.do")
    public String orderComplete(){
    	return "orders/orderComplete";
    }
}
