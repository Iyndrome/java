import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatClass {

	public static void main(String[] args) {
		//날짜 서식은 simpleDateFormat
		//2020년 4월 28일 오후 5시 47분
		Date date = new Date();
		//날짜 서식 만들기 - yyyy년 MM월 dd일 EEE a hh시 mm분
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 EEE a hh시 mm분");
		String msg = sdf.format(date);
		System.out.println(msg);
		
		//숫자 서식 만들기
		DecimalFormat df = new DecimalFormat("\u00A4 #,###.00");
		msg = df.format(1250000);
		System.out.println(msg);
		
		

	}

}
