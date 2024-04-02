package bd2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OldStudyDuration {
	int elementary;
	int middle;
	int high;
	int higherEd;
	int week=39,a,time=0,timeH=0;
	
    public OldStudyDuration(int year,int min) {//1978 on
    	int year1=year;
    		for(int i=1; i<=15;i++) {
    			a=hYear(year1);
    			int l=6;
        		if(i<=3) {
        			if(a==2) { a=1; }
        			elementary+=week*20+a*4;
        			}
        		else if(i<=8) {
        			if(a==2) {
        				l-=2;
        				a=1;
        			}
        			middle+=week*34+a*l;}
        		else if(i<=10){
        			if(a==2) {
            			a=1;
            		}high+=week*36+a*6;}
        		else {
        			if(a==2) {
            			a=1;
            		}higherEd+=week*18+a*3;}
        		year1+=1;
        	}
    		time+=(elementary+middle+high)*min;  //Дунд сургуульд сурсан хугацаа (нийт)
    		timeH+=higherEd*90;                  //Их дээд сургууль сурсан хугацаа (нийт)
    }
    OldStudyDuration(int year,int min,int minH){// 2006 on
    	int year1=year;
    	for(int i=1; i<=16;i++) {
			a=hYear(year1);
			if(a==2) {
				a=1;
			}
    		if(i<=5) { elementary+=week*20+a*4; }
    		else if(i>=6&&i<=12) { middle+=week*30+a*6; }
    		else { higherEd+=week*18+a*3; }
    		year1+=1;
    	}
    	time+=elementary*min;
		time+=middle*minH;
		timeH+=higherEd*90;
    }
    public int getTime() {// дунд сургуульд сурсан хугацаа
    	return time;
    }
    public int getTimeH() {// их дээд сургуульд сурсан хугацаа
    	return timeH;
    }
    public int getElementary() { //бага сургуульд сурсан хугацаа 7 хон
    	return elementary;
    }
    public int getMiddle() { //дунд сургуульд сурсан хугацаа 7 хон
    	return middle;
    }
    public int getHigherEd() { // Их дээд сургуульд сурсан хугацаа 7 хон
    	return higherEd;
    }
    public int getHigh() { //ахлах сургуульд сурсан хугацаа 7 хон
    	return high;
    }
    
    public int favouriteSub(int year) { //дуртай хичээл судлах хугацаа минут
    	int t=year,k,weekT=0;
    	if(t==2006) {
    		k=12;
    	}
    	else {k=10;}
    	for(int i=t;i<t+k;i++) {
    		week=38;
    		DayOfWeek day=new DayOfWeek(i,9,1);
    		int d=day.getDayOfWeek();
    		int b=hYear(i);
    		if(b==1) {
    			if(d==2||d==1) {week=39;}
    		}
    		else { if(d==2){week=39; } }
    		weekT+=week;
    	}
    	return weekT*4;
    }
    public int higheredD(int year,int  high) { // их дээд сургууль дадлагын хугацаа
    	 //high- niit sursan 7 honog
    	int t=year,k,week=0;
    	if(t==2006) {k=4;}
    	else {k=5;}
    	week=8*k;
    	return week;
    }
    public float dad(int  high,int week) {
    	return (float)week/high;
    }
public int hYear(int year) { //өндөр жил олдог
	int k=0;
	if(year%4==0) {
		DayOfWeek day=new DayOfWeek(year,9,1);
		int b=day.getDayOfWeek();
		if(year>2005) { 
			if(b!=1&&b!=0) { k=1; }
		}
		else { 
			if(b!=1) {
				if(b==0) {k=2;}
				else{k=1;} }
			}
		}
		else { k=0; }
	return k;
}
}