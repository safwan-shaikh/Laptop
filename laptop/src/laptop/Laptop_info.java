package laptop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Laptop_info {
	
	Map<String, Laptop> laptoplist=new HashMap<String,Laptop>();
	public Laptop_info(Map<String, Laptop> listMap) {
		this.laptoplist=listMap;
	}
	
	public ArrayList<Laptop> listAllLaptop() {
		ArrayList<Laptop> listL=new ArrayList<>();
		laptoplist.forEach((key,value)->{
			listL.add(value);
		});
		
		return listL;
	}
	

	public ArrayList<Laptop> listByBrand(String Brand) {
		ArrayList<Laptop> listL=new ArrayList<>();
		laptoplist.forEach((key,value)->{
			if (value.getBrandName()==Brand) {
				listL.add(value);
			}
			
		});
		
		return listL;
	}
	
	public ArrayList<Laptop> listBySP(Boolean isMin,Integer amount) {
		ArrayList<Laptop> listL=new ArrayList<>();
		laptoplist.forEach((key,value)->{
			if (isMin) {
				if (value.getSellingPrice()<amount) {
					listL.add(value);
				}
				
				
			}else{
				if (value.getSellingPrice()>amount) {
					listL.add(value);
				}
				
			}
			
		});
		
		return listL;
	}
	
	public ArrayList<Laptop> listByScreenSize(Float screenSize) {
		ArrayList<Laptop> listL=new ArrayList<>();
		laptoplist.forEach((key,value)->{
			
				if (value.getScreenScize()<screenSize) {
					listL.add(value);
				}
			
		else{
				if (value.getScreenScize()>screenSize) {
					listL.add(value);
				}
				
			
		}}
		);
		
		return listL;
	}
	
	public ArrayList<Laptop> listByStorage(Integer storageCap) {
		ArrayList<Laptop> listL=new ArrayList<>();
		laptoplist.forEach((key,value)->{
			if (value.getStorageCapacity()>storageCap) {
				listL.add(value);
			}
			
		});
		
		return listL;
	}
	
	public ArrayList<Laptop> listByisSSD(Boolean isSSD) {
		ArrayList<Laptop> listL=new ArrayList<>();
		laptoplist.forEach((key,value)->{
			if (isSSD) {
				if (value.getIsSSD()) {
					listL.add(value);
				}
				
			}
			else {
				if (!value.getIsSSD()) {
					listL.add(value);
				}
			}
		});
		
		return listL;
	}
	
	public ArrayList<Laptop> listByOS(String OS) {
		ArrayList<Laptop> listL=new ArrayList<>();
		laptoplist.forEach((key,value)->{
			if (value.getOs()==OS) {
				listL.add(value);
			}
		});
		
		return listL;
	}
	
}
