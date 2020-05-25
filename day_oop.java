package day_oop;

public class day_oop{
	private int year;
	private int month;
	private int day;
	public void set_day(int y, int m, int d){
		year = y;
		month = m;
		day = d;
	}
	public String calc_day_name(){
		int temp = 0;
		for(int i=0;i<year;i++){
			if(is_yoon(i)==1){
				temp+=366;
			}else{
				temp+=365;
			}
		}
		for(int i=1;i<month;i++){
			temp += calc_day_cnt(year,i);
		}
		temp += day+5;
		temp = temp%7;

		return output_day(temp);
	}

	private int calc_day_cnt(int y, int m){
		if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
			return 31;
		}else if(m==4 || m==6 || m==9 || m==11){
			return 30;
		}else if(is_yoon(y)==1){
			return 29;
		}
		else{
			return 28;
		}
	}
	private int is_yoon(int y){
		if(y%4==0){
			if(y%100==0 && y%400!=0){
				return 0;
			}
			else{
				return 1;
			}
		}
		return -1;
	}

	private String output_day(int day_num){
		String result = "";
		switch(day_num){
			case 0:
				result = "일요일";
				break;
			case 1:
				result = "월요일";
				break;
			case 2:
				result = "화요일";
				break;
			case 3:
				result = "수요일";
				break;
			case 4:
				result = "목요일";
				break;
			case 5:
				result = "금요일";
				break;
			case 6:
				result = "토요일";
				break;
			default:
				result = "erro";
				System.out.println("데이넘 : " + day_num);
				break;
		}

		return result;
	}
}
