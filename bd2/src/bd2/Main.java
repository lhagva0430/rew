package bd2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tootsoo();
	}
	public static void tootsoo() {
		OldStudyDuration year8=new OldStudyDuration(1978,45);
		int el=year8.getElementary();
		int mid=year8.getMiddle();
		int hi=year8.getHigh();
		int higherE=year8.getHigherEd();
		int time8=year8.getTime();
		int timeH8=year8.getTimeH();
		int favor8=year8.favouriteSub(1978);
		float dadlaga6=year8.higheredD(1978, higherE);
		
		OldStudyDuration year6=new OldStudyDuration(2006,30,35);
		int elm=year6.getElementary();
		int mide=year6.getMiddle();
		int higher=year6.getHigherEd();
		int time6=year6.getTime();
		int timeH6=year6.getTimeH();
		int favor6=year6.favouriteSub(2006);
		float dadlaga8=year8.higheredD(2006, higher);
		
		float perc=(float)favor8/favor6;
		System.out.println("Дунд сургууль -> 1978-1988: "+time8+" мин 2006-2018: "+time6+" мин\n");
		System.out.println("Их дээд сургууль -> 1988-1993: "+timeH8+" мин 2018-2022: "+timeH6+" мин\n");
		System.out.println("Дуртай хичээл судлах хугацаа ба нийт дунд сургуульд сурсан хугацааны харьцаа:\n ->"+" "+favor8+" "+favor6+" "+perc+"%\n");
		System.out.println("Дадлагын ба нийт их дээд сургуульд сурсан хугацааны харьцаа ->\n 1988-1993 :"+dadlaga8+"% 2018-2022 : "+dadlaga6+"%");

	}
}
