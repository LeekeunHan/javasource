package emp.db2;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 접근하고자 하는 테이블의 필드와 동일하게 생성
// exam_emp 
//@AllArgsConstructor		//전제다 들어있는 생성자 생성
//@NoArgsConstructor		//default 생성자 생성
//@Setter					//setter 메소드 생성
//@Getter					//getter 메소드 생성
//@ToString					//Tostring 생성 

@NoArgsConstructor
@AllArgsConstructor		// @AllArgsConstructor 가들어오면 NoArgsConstructor(defalut) 생성자는 사라진다 
@Data					//getter , setter , noargsconstructor , equals 모아둔것, AllArgsConstructo는빼고 
public class EmpDTO {
	private int empno;
	private String ename;
	private String job;
	private  int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
}
