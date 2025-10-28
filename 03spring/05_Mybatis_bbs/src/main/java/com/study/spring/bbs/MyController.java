package com.study.spring.bbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

	@Autowired
	IBbsDao dao;

	@RequestMapping("/")
//	@ResponseBody
	public String root() {
		return "redirect:list";
	}

	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("lists", dao.listDao());
		model.addAttribute("count", dao.countDao());
		return "list"; // jsp . model value 전송
	}

	@RequestMapping("/view")
//	public String view(HttpServletRequest req, Model model) {
//		String id = req.getParameter("id");
//		model.addAttribute("dataView", dao.viewDao(id));
//		return "view";
//	}
	public String view(@RequestParam("id") String id, Model model) {
		model.addAttribute("dataView", dao.viewDao(id));
		return "view";
	}
	
	@RequestMapping("/writeForm")
	public String writeForm() {
		return "writeForm"; // writeDorm.jsp <form action="write"></from>
	}

	@RequestMapping("/write")
//	public String write(HttpServletRequest req) {
//		String writer = req.getParameter("writer");
//		String title = req.getParameter("title");
//		String content = req.getParameter("content");
	public String write(@RequestParam("writer") String writer, 
						@RequestParam("title") String title,
						@RequestParam("content") String content) {
		
		dao.writeDao(writer, title, content);
		return "redirect:list"; // 작성 후 목록으로 이동
	}

	@RequestMapping("/delete")
//	public String delete(HttpServletRequest req) {
//		String id = req.getParameter("id");
//		dao.deleteDao(id);
	 public String delete(@RequestParam("id") String id) {
        dao.deleteDao(id);

		return "redirect:list";
	}
	 


}
