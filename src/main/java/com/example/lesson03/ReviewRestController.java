package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.model.Review;

@RestController
public class ReviewRestController {
	
	@Autowired
	private ReviewBO reviewBO;

	// http://localhost/lesson03/ex01
	// http://localhost/lesson03/ex01?id=2
	@RequestMapping("/lesson03/ex01")
	public Review ex01(
//			@RequestParam("id") int id //필수 파라미터
//			@RequestParam(value="id") int id //필수 파라미터
//			@RequestParam(value="id", required=true) int id // 필수 파라미터
//			@RequestParam(value="id", required=false) Integer id  // 비필수 파라미터 int = 필수를 의미
			@RequestParam(value="id", defaultValue="1") int id  // 비필수 파라미터이지만 defualt값이 있기 때문에 int를 사용해도 무관
			) {
		System.out.println("##### id : " + id);
		return reviewBO.getReview(id);
	}
	
	// http://localhost/lesson03/ex02
	@RequestMapping("/lesson03/ex02")
	public String ex02() {
		Review review = new Review();
		review.setStoreName("배달삼겹");
		review.setMenu("삼겹혼밥세트");
		review.setUserName("박영기");
		review.setPoint(4.5);
		review.setReview("혼자 먹기 적당하네요.");
		
		int row = reviewBO.addReview(review);  // insert된 row 수를 return 받는다.
		
		return 0 < row ? row + "행 입력 성공했습니다." : "실패했습니다.";
	}
	// http://localhost/lesson03/ex02/2
	@RequestMapping("/lesson03/ex02/2")
	public String ex02_2() {
		int row = reviewBO.addReviewAsField("도미노피자", "콤비네이션R", "안녕", 3.4, "뭐야이거");
		return "입력 성공: " + row;
	}
	
	// http://localhost/lesson03/ex03?id=8&review=도미노피자는 맛나쥐
	@RequestMapping("/lesson03/ex03")
	public String ex03(
			@RequestParam("id") int id,
			@RequestParam("review") String review) {
		
		int row = reviewBO.updateReviewById(id, review);
		return "변경 완료 :" + row;
	}
	
	// http://localhost/lesson03/ex04?id=8
	@RequestMapping("/lesson03/ex04")
	public void ex04(
			@RequestParam("id") int id) {
		reviewBO.deleteReviewById(id);
	}
}
