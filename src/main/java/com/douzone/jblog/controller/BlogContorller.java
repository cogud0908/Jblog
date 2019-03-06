package com.douzone.jblog.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.douzone.jblog.security.Auth;
import com.douzone.jblog.service.AdminService;
import com.douzone.jblog.service.BlogService;
import com.douzone.jblog.service.FileuploadService;
import com.douzone.jblog.vo.BlogVo;
import com.douzone.jblog.vo.CategoryVo;


@Controller
@RequestMapping("/{id}") // /{"id:?!(assets).*}")
public class BlogContorller {
		
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("")
	public String main(@PathVariable String id, Model model) {
		
		BlogVo blogVo = adminService.getVo(id);
		List<CategoryVo> list = adminService.categoryGetList(id);
		
		model.addAttribute("blogVo",blogVo);
		model.addAttribute("siteId",id);
		model.addAttribute("list", list);
		
		return "/blog/blog-main";
	}
			
}
