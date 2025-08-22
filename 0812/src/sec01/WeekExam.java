package sec01;

import java.util.Calendar;

public class WeekExam {

	public static void main(String[] args) {
		
		//열거 타입으로 받을 변수
		Week today = null; //열거타입으로 변수 today 선언
		
		//calendar
		Calendar cal = Calendar.getInstance();
		
		//오늘의 요일을 얻는 방법;
		int week = cal.get(Calendar.DAY_OF_WEEK); //1번이 일 ~ 7번 토요일
		
		//숫자를 받아서 열거 상수로 변환
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.TURUSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		
		}
		
		
	}
}
