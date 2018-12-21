package com.mask.blog.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mask.blog.vo.Menu;

/**
 * 管理员控制器
 * 
 * @author Mask
 */
@Controller
@RequestMapping("/admins")
public class AdminController {
	/**
	 * 获取后台管理主页面
	 * 
	 * @return
	 */
	@GetMapping
	public ModelAndView listUsers(Model model) {
		List<Menu> list = new ArrayList<>();
		list.add(new Menu("用户管理", "/users"));
		list.add(new Menu("角色管理", "/roles"));
		list.add(new Menu("博客管理", "/blogs"));
		list.add(new Menu("评论管理", "/commits"));
		model.addAttribute("list", list);
		return new ModelAndView("/admins/index", "model", model);
	}
}
