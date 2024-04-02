package bd2;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 
public class JTableExamples {
    // frame
    JFrame f;
    // Table
    JTable j;
 
    // Constructor
    JTableExamples()
    {
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
		
        // Frame initialization
        f = new JFrame();
 
        // Frame Title
        f.setTitle("JTable Example");
 
        // Data to be displayed in the JTable
        String[][] data = {
            {"1978-1981","бага анги",""+el+ " минут"},
            {"1981-1986","дунд анги",""+mid+" минут"},
            {"1986-1988","ахлах анги",""+hi+" минут"}
            ,{"1978-1988", "нийт", ""+time6+" минут" },
            {"1988-1993","их сургууль ",""+higherE+" минут"},
            {"2006-2011", "бага анги", ""+elm +" минут"},
            {"2011-2018", "ахлах анги", ""+mide+" минут" }
            ,{"2006-2018", "нийт", ""+time8+" минут" }
            ,{"2018-2022", "их сургууль", ""+higher+" минут" }
           
           
        };
 
        // Column Names
        String[] columnNames = { "он", "төлөв", "утга" };
 
        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
 
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);
    }
 
    // Driver  method
    public static void main(String[] args)
    {
        new JTableExamples();
    }
}
	 