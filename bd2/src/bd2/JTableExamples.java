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
		int dadlaga8=year8.higheredD(1978, higherE);
		float dadlaga8t=year8.dad(higherE, dadlaga8);
		
		OldStudyDuration year6=new OldStudyDuration(2006,30,35);
		int elm=year6.getElementary();
		int mide=year6.getMiddle();
		int higher=year6.getHigherEd();
		int time6=year6.getTime();
		int timeH6=year6.getTimeH();
		int favor6=year6.favouriteSub(2006);
		int dadlaga6=year6.higheredD(2006, higher);
		float dadlaga6t=year6.dad(higher, dadlaga6);
		float perc=(float)favor8/favor6;
        // Frame initialization
        f = new JFrame();
 
        // Frame Title
        f.setTitle("JTable Example");
 
        // Data to be displayed in the JTable
        String[][] data = {
            {"1978-1981","бага анги",""+el, " цаг"},
            {"1981-1986","дунд анги",""+mid," цаг"},
            {"1986-1988","ахлах анги",""+hi," цаг"}
            ,{"1978-1988", "нийт", ""+time6," минут" },
            {" 1978-1988", "дуртай хичээл", ""+favor8," минут" },
            {"1988-1993","их сургууль ",""+higherE," цаг"},
            {"2006-2011", "бага анги", ""+elm ," цаг"},
            {"2011-2018", "ахлах анги", ""+mide," цаг" }
            ,{"2006-2018", "нийт", ""+time8," минут" }
            ,{"2018-2022", "их сургууль", ""+higher," цаг" },
            {" 2006-2018", "дуртай хичээл", ""+favor6," минут" },
            {" 1978-1988", "дуртай хичээл", ""+favor8," минут" },
            {" ", "харьцаа", ""+perc," %" },
            {"1988-1993"," дадлага ",""+dadlaga8," 7 хоног"},
            {"2018-2022", "дадлага", ""+dadlaga6," 7 хоног" },
            {"1988-1993"," Дадлагын ба нийт их дээд сургуульд \n сурсан хугацааны харьцаа ",""+dadlaga8t," %"},
            {"2018-2022", "Дадлагын ба нийт их дээд сургуульд \n сурсан хугацааны харьцаа", ""+dadlaga6t," %" }
       
        };
 
        // Column Names
        String[] columnNames = { "он", "төлөв", "утга" ,"нэгж"};
 
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
}//19:18
	 