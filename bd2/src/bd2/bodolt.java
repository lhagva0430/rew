package bd2;

public class bodolt  {
	
	int elemantaryClassTime = 24;
	int middleClassTime = 34;
	int highClassTime = 36;
	int higherEdTime = 18;
	int secondarySchoolTimeLimit = 45;   //dund sur 1tsag=45min 1978
	int higherEdTimeLimit = 90;  //deed sur 1tsag=90min 
	int subTime1_5=20;
	int subTime6_12=30;
	String fday="fri";
	
public int jil(int f, int l) {
	boolean old;
	boolean young;
	if((f>=1978&&l<=1993)) {
		old=true;
	}
	else if((f>=2006&&l<=2022)) {
		young=true;
	}
	
	return 0;
}
public int lSunday(int a) {
	int jil=a-1978, b=jil;
	int k = 0,l=270;
	int on=1978;
		while(jil>=0) {
			int m=(on-1976)%4;
			if(m==3) {
				l+=366;
				k=(l-3)%7;		
				}
			else if(jil==b){
				k=l%7;
				l+=3;
			}
			else {
				l+=365;
				k=(l-3)%7;
			}
			jil-=1;
			on+=1;
		}
	return 31-k;
}

public int fMonday(int a) {
	int day=5;
	int k=a-1976;
	int on=1978;
	while(k-2>=0) {
		if(on%4==0) {
			if(day==2) {
				day=7;
			}
			else if(day==1) {
				day=6;
			}
			else {
				day-=2;
			}
		}
		else {
			if(day==1) {
				day=7;
			}
			else {
				day-=1;
			}
		}
		on+=1;
		k-=1;
	}
	return day;
}
public int weekday(int fday, int a) {
	//hicheellej baigaa 7 honogiin toog bodoh
	int jil=a-1978, b=jil;
	int l=0;
	int on=1978;
	while(jil>=0) {
		if(fday==1) {
		l+=39;	
		}
		else{
			l+=38;
		}
		
	}
	return l;
}

public void hTsag(){
	//hicheellej bgaa tsagiig tootsoh
}
public void hHonog() {
	//hicheeliin udruud
}
public void angi() {
	//oniig ashiglan heddugeer angi gedegiig tootsooloh
}
public void dadlagaTsag() {
	//oyutanii dadlagiin hugatsaag bodoh
}
public void enjoyTime() {
	//sonirhson hicheel useh tsag
}
public static void main(String arg[]) {
	bodolt a=new bodolt();
	int on=1986;
	int b=a.fMonday(on);
	int k=a.lSunday(b, on);
	System.out.println(on+" k= "+k);
}
}

