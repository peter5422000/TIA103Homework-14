package hw1;

public class JULY13th {
	public static void main(String[] args) {
		int a=12; int b=6;
			System.out.println("6跟12的和為"+a+b);
			System.out.println("6跟12的積為"+a*b+"\n");
		
		int c=200;int d= 12;
		int e=c/d;int f=c%d; 
			System.out.println("200顆雞蛋是"+e+"打"+f+"顆"+"\n");
			
		int sec1 = 256559;
		int day1 = 60*60*24;
		int hr1= 60*60;
		int min1=60;
		
		int day2= sec1/day1;
		int hr2=sec1%day1/hr1;
		int min2=sec1%day1%hr1/min1;
		int sec2=sec1%day1%hr1%min1;
			System.out.println("256,559秒是"+day2+"天"+hr2+"時"+min2+"分"+sec2+"秒"+"\n");
			
		double pi =3.1415;
		double r = 5;
		double area = r*r*pi;
		double perimeter = r*pi;
			System.out.printf("半徑為5的圓面積為%.2f周長為%.2f%n%n",area,perimeter);
			
		double save=1500000;
		double rate=0.02;
		double total=save*Math.pow((1+rate), 10);
			System.out.printf("十年後本息總和為%.0f元%n%n",total);
			
		System.out.println(5+5);//打印資料為int資料5+5=10
		System.out.println(5+'5');//打印資料為int資料5+53(5的unicode編碼)
		System.out.println(5+"5");//打印資料為兩個字串資料5
		
				
		
		
		
	}
		
}
