package com.example.lesson05;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lesson05Controller {
	
	// http://localhost/lesson05/ex01
	@RequestMapping("/lesson05/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	// http://localhost/lesson05/ex02
	@RequestMapping("/lesson05/ex02")
	public String ex02(Model model) {
		// 리스트 스트링
		List<String> fruits = new ArrayList<>();
		fruits.add("키위");
		fruits.add("망고");
		fruits.add("포도");
		fruits.add("사과");
		fruits.add("바나나");
		
		model.addAttribute("fruits", fruits);
		
		// List<Map>
		List<Map<String, Object>> users = new ArrayList<>();
		Map<String, Object> user = new HashMap<>();
		user.put("name", "영기");
		user.put("age", 29);
		user.put("hobby", "게임");
		users.add(user);
		
		user = new HashMap<>();
		user.put("name", "강아지");
		user.put("age", 2);
		user.put("hobby", "자기");
		users.add(user);
		
		model.addAttribute("users", users);
		
		return "lesson05/ex02";
	}
	
	// http://localhost/lesson05/ex03
	@RequestMapping("/lesson05/ex03")
	public String ex03(Model model) {
		Date today = new Date();
		model.addAttribute("today", today);
		
		return "lesson05/ex03";
	}
}
