package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lesson04.bo.NewStudentBO;
import com.example.lesson04.model.NewStudent;

@RequestMapping("/lesson04")
@Controller
public class NewStudentController {
	
	@Autowired
	private NewStudentBO newStudentBO;
	
	// http://localhost/lesson04/add_student_view
	@GetMapping("/add_student_view")
	public String addStudentView() {
		return "lesson04/addStudentView";
	}
	// http://localhost/lesson04/add_student
	@PostMapping("/add_student")
	public String addStudent(
			@ModelAttribute NewStudent newStudent,
			Model model) {  // 태그에서 name속성에 일치하는 필드에 값이 들어간다.
		
		// db insert
		newStudentBO.addNewStudent(newStudent);
		
		// db select => 가입했던 데이터
		newStudent = newStudentBO.getStudentById(newStudent.getId());
		
		// model에 담는다.
		model.addAttribute("result", newStudent);
		model.addAttribute("subject", "학생 정보");
		
		// return jsp 경로
		return "lesson04/afterStudentView";
	}
}
