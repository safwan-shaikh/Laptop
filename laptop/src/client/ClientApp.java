package client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import laptop.Laptop;
import laptop.Laptop_info;

public class ClientApp {

	public static void main(String[] args) {
		
		Map<String, Laptop> m=new HashMap<String,Laptop>();
		
			 m.put("Apple"+"Macbook Air 2017",new Laptop("Apple", "Macbook Air 2017", 64692, 14.0f, 128, true,"iOS Sierra"));
			 m.put("Apple"+"Macbook Pro 13",new Laptop("Apple", "Macbook Pro 13", 66833, 13.3f, 500, true,"Mac OS X"));
			 m.put("HP"+"15s",new Laptop("HP", "15s", 49490, 15.6f, 512, true,"Windows 10"));
			 m.put("Lenovo"+"Idea Pad Slim 3i",new Laptop("Lenovo", "Idea Pad Slim 3i", 54490, 13.3f, 1000, false,"Windows 10"));
			 m.put("Asus"+"VivoBook 15",new Laptop("Asus", "VivoBook 15", 38990, 15.60f, 1000, true,"Windows 10"));
			 m.put("Lenovo"+"Ideapad S145",new Laptop("Lenovo", "Ideapad S145", 35999, 15.6f, 1000, false,"Windows 10"));
	
			 
			 Laptop_info sInfo=new Laptop_info(m);
			 
			 ArrayList<Laptop> laptopList= sInfo.listAllLaptop();
			 printLaptop(laptopList);
			 
			 ArrayList<Laptop> filterByBrand= sInfo.listByBrand("Apple");
			 //printLaptop(filterByBrand);
			 
			 ArrayList<Laptop> filterBySP= sInfo.listBySP(true,50000);
			 //printLaptop(filterBySP);
			 
			 ArrayList<Laptop> filterByScreenSize= sInfo.listByScreenSize(15.0f);
			 //printLaptop(filterByScreenSize);
			 
			 ArrayList<Laptop> filterByStorage= sInfo.listByStorage(500);
			 printLaptop(filterByStorage);
			 
			 
			 ArrayList<Laptop> filterByIsSSD= sInfo.listByisSSD(true);
			 //printLaptop(filterByIsSSD);
			 
			 ArrayList<Laptop> filterByOS= sInfo.listByOS("Windows 10");
			 //printLaptop(filterByOS);
			  
	}
	
	public static void printLaptop(ArrayList<Laptop> p)
	{
		for(Laptop k : p) {
			
			System.out.println("Brand: "+k.getBrandName());
			System.out.println("Model: "+k.getModelName());
			System.out.println("Price: "+k.getSellingPrice());
			System.out.println("ScreenSize: "+k.getScreenScize());
			System.out.println("Storage: "+k.getStorageCapacity()+" GB");
			System.out.println("Has SSD: "+k.getIsSSD());
			System.out.println("OS: "+k.getOs());
			System.out.println();
			
			
		}
	}
}
