package sec01;

import java.util.Calendar;

public class WeekExam {

	public static void main(String[] args) {
		
		//���� Ÿ������ ���� ����
		Week today = null; //����Ÿ������ ���� today ����
		
		//calendar
		Calendar cal = Calendar.getInstance();
		
		//������ ������ ��� ���;
		int week = cal.get(Calendar.DAY_OF_WEEK); //1���� �� ~ 7�� �����
		
		//���ڸ� �޾Ƽ� ���� ����� ��ȯ
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
