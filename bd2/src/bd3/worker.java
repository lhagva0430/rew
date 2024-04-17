package bd3;

public class worker {
    private String name;
    private String code;
    private String mergejil;
    private String beginDate;
    
   
    public worker(String ss) {
		String [] str;
		str=ss.split("/");
		mergejil=str[0];
		name=str[1];
		code=str[2];
		beginDate=str[3];
	}
    public  void display() {
		String title="%-20s %-30s %-40 %1s\n";
		System.out.printf(title,code, name,mergejil,beginDate);
	}
}
