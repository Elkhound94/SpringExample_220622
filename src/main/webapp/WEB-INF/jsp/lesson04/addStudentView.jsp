<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생추가</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h1>학생 정보 추가</h1>
		
		<form method="post" action="/lesson04/add_student">
			<div class="from-group">
				<label for="name" class="mt-2 mb-0">이름</label><br>
				<input type="text" id="name" name="name" 
					class="from-control col-3" placeholder="이름을 입력하세요.">
			</div>
			
			<div class="from-group">
				<label for="phoneNumber" class="mt-2 mb-0">핸드폰번호</label><br>
				<input type="text" id="phoneNumber" name="phoneNumber" 
					class="from-control col-3" placeholder="예)01011112222">
			</div>
			
			<div class="from-group">
				<label for="email" class="mt-2 mb-0">e-mail</label><br>
				<input type="text" id="email" name="email" 
					class="from-control col-3" placeholder="이메일 주소를 입력하세요.">
			</div>
			
			<div class="from-group">
				<label for="dreamJob" class="mt-2 mb-0">장래희망</label><br>
				<input type="text" id="dreamJob" name="dreamJob" 
					class="from-control col-3" placeholder="장래희망을 입력하세요.">
			</div>
			
			<input type="submit" class="btn btn-success mt-2" value="회원가입">
		</form>
	</div>
</body>
</html>