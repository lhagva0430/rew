package bd2;

public class bodolt {
	
	int hicheeltsag1_3=24;
	int hicheelTsag4_8=34;
	int hicheelTsag9_10=36;
	int dundMin=45;   //dund sur 1tsag=45min 1978
	int deedTsag=18;
	int deedMin=90;  //deed sur 1tsag=90min 
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
public void fMonday(int a) {
	int month;
	String day;
	int k=(a-1978)*273%7;
	switch(k) {
	case 0:
		day="fri";
		break;
	case 1:
		day="sat";
		break;
	case 2:
		day="sun";
		break;
	case 3:
		day="mon";
		break;
		
	}
	
}
public void lSunday() {
	
}
public void weekday(int a, int b) {
	//hicheellej baigaa 7 honogiin toog bodoh
	
	
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


}
