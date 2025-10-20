package com.study.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.study.spring.Application;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    private final Application application;

    MyController(Application application) {
        this.application = application;
    }

		@RequestMapping("/")
		@ResponseBody
		public String root() {
			return "jsp 입니다.";
		}
		
//		@RequestMapping("/view1")
//		public String view1() {
//			return "index";
//		}
		
		@RequestMapping("/index")
		// http://localhost:8080/index?name=이순신&age=30
		public String index(
				HttpServletRequest request,
				Model model
				) {
			
			String name=request.getParameter("name");
			String age=request.getParameter("age");

			
			System.out.println(name);
			
			model.addAttribute("name",name);
			model.addAttribute("age",age);
			
			
			
			return "index";
		}
		
		// http://localhost:8080/index?name=이순신&age=30
		@RequestMapping("/view1")
		public String view1 (
				@RequestParam("name") String name,
				@RequestParam("age") String age,
				Model model
				) {
			
			model.addAttribute("name", name);
			model.addAttribute("age", age);

			return "view1";  //view1.jsp return
		}
		
		// http://localhost:8080/index?name=이순신&age=30
		@RequestMapping("/view2")
		public String view2(
				Member member, // DTO(trans class), DAO(database class)
				Model model
				) {
			
			return "view2";   //view2.jsp
		}
		@RequestMapping
		public String form() {
			return "form"; //form.jsp

		}

		// http://localhost8080/test1/hanyong5/11111
		
		@RequestMapping("/test1/{myId}/{myNum")
		public String test1(
				@PathVariable("myId") String myId,
				@PathVariable("myNum") String myNum,
				Model model
				) {
			
			System.out.println(myId);
			
			// model database 자료를 가지고 오는 DAO
			
			model.addAttribute("id",myId);
			model.addAttribute("num",myNum);
			
			return "test1"; //test.jsp
		}
		
		
}
