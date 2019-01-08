package cn.itcast.jk.controller.basicinfo.factory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.jk.controller.BaseController;
import cn.itcast.jk.domain.Factory;
import cn.itcast.jk.service.FactoryService;

/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014-3-12
 */
@Controller
public class FactoryController extends BaseController {
	@Autowired
	FactoryService factoryService;
	
	@RequestMapping("/basicinfo/factory/list.action")
	public String list(Factory factory,Model model) {
		List<Factory> dataList=factoryService.find(null);
		model.addAttribute("dataList",dataList);
		return "/basicinfo/factory/jFactoryList.jsp";
	}
	
}
