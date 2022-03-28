package enumtest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EnumWeekEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;	//Week을 enum타입으로 선언 /week -> today 
		
		LocalDate now = LocalDate.now();//LocalDate 클래스 : 같은 타입이 아니라면 import가 들어옴
		//클래스.메소드명() 
		//LocalDate now = LocalDate.now(); : 오늘날짜를 가져올수 있다 
		
		//System.out.println(now); 
		
		//요일에 따라서 숫자를 리턴 : 월(1) ~ 일(7)
		DayOfWeek week=now.getDayOfWeek();
		//System.out.println(week.getValue());
		
		
		switch (week.getValue()) {
		case 1:
			today= Week.MONDAY;	//today = "월요일" 
			break;
		case 2:
			today= Week.TUESDAY;
			break;
		case 3:
			today= Week.WEDMESDAY;
			break;
		case 4:
			today= Week.THURSDAY;
			break;
		case 5:
			today= Week.FRIDAY;
			break;
		case 6:
			today= Week.SATURDAY;
			break;
		case 7:
			today= Week.SUNDAY;
			break;
		default:
			break;
		}
		System.out.println("오늘요일은 "+today);
		
	}

}
