package bd3;
import java.io.*;
import java.util.*;

public class Copy {
	public  ArrayList majorList=new ArrayList();
 public  void readSubjectList() {
		try {
			File f=new File("kj.txt");
			Scanner s=new Scanner(f);
			int k=0;
			while(s.hasNext()) {
				worker sub=new worker(s.nextLine());
				majorList.add(k++, sub);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Error:"+e.getMessage());
			System.exit(0);
		}
	}
 public void printSubject() {
		for(int i=0;i<majorList.size();i++) 
			((worker)majorList.get(i)).display();
		
	}
	public static void main(String[] args) {
		Copy c1=new Copy();
		c1.readSubjectList();
		c1.printSubject(); 
	}
	}
