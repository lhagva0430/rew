package lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Item {
    String getTitle();
}

class Movie implements Item {
    private String title;
    private int year;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }
@Override
    public String getTitle() {
        return title + " (" + year + ")";
    }

    public String getTitleWithoutYear() {
        return title;
    }
}

class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
        System.out.println("1. Кино нэмэх");
        System.out.println("2. Кино хасах");
        System.out.println("3. Киног нэмэгдсэн дарааллаар харах");
        System.out.println("4. Хоосон эсэхийг шалгах ");
        System.out.println("5. Kино хайх");
        System.out.println("6. Дуусгах");
        System.out.println("----------------------------------");
        int b=sc.nextInt();
        switch(b) {
        case 1:
        addElement(items,sc);
        break;
        case 2:
        removeElement(items,sc);
        break;
        case 3:
        Element(items);
        break;
        case 4:
        checkEmpty(items);
        break;
        case 5:
        findMovie(items,sc);
        case 6:
        System.exit(0); System.out.println("wdni");
        break;
        }
        }
    }

    private static void addElement(List<Item> items, Scanner sc) {
	    System.out.println("Киноны нэрийг оруулна уу:");
	    String element1 = sc.nextLine();  
	    element1 = sc.nextLine();  
	    System.out.println("Киноны жилийг оруулна уу:");
	    int element2 = sc.nextInt();  
	    sc.nextLine();
	    items.add(new Movie(element1, element2));
	}
    private static void removeElement(List<Item> items, Scanner sc) {
	    System.out.println("Хасах киноны нэрийг оруулна уу :");
	    String element1 = sc.nextLine(); 
	    boolean removed = false;
	    element1 = sc.nextLine();  
	    for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (item instanceof Movie && ((Movie) item).getTitleWithoutYear().equals(element1)) {
                items.remove(i);
                removed = true;   
            }
        }
	    if(removed) {
	    	System.out.println("'"+element1+"' кино амжилттай хасагдлаа ");
	    }
	    else {System.out.println("'"+element1+"' кино олдсонгүй ");}
	}
	private static void Element(List<Item> items) {
		// TODO Auto-generated method stub
		System.out.println("Кино нэмэгдсэн дараалал:");
	    for (int i = 0; i < items.size(); i++) {
	        Item item = items.get(i);
	        System.out.println(i+1 + ": " + item.getTitle());}
	}

	private static void checkEmpty(List<Item> items) {
	    // TODO Auto-generated method stub
	    if(items.isEmpty()) {
	        System.out.println("Жагсаалт хоосон байна.");
	    } else {
	        System.out.print("Жагсаалтанд:");
	        for (Item item : items) {
	            System.out.print(" " + item.getTitle());
	        }
	        System.out.println(" Эдгээр кинонууд байна.");
	    }
	}


	private static void findMovie(List<Item> items, Scanner sc) {
		// TODO Auto-generated method stub
		 System.out.println("Хайх киноны нэрийг оруулна уу :");
		    String element1 = sc.nextLine(); 
		    element1 = sc.nextLine();  
		    for (int i = 0; i < items.size(); i++) {
	            Item item = items.get(i);
	            if (item instanceof Movie && ((Movie) item).getTitleWithoutYear().equals(element1)) { 
	                System.out.println("'"+item.getTitle()+"' кино жагсаалтад байна ");
	            }
	            else {
	            	System.out.println("Кино олдсонгүй ");
	            }
	        }
	}
	
}
//6:24