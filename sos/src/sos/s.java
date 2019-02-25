package sos;

import java.util.ArrayList;

public class s {
	static int price;
	public static ArrayList<product> m=new ArrayList<>();

	public static int getcount() {
		// TODO Auto-generated method stub
		 int a=m.size();
		return a;
	}

	public void add(product ob) {
		// TODO Auto-generated method stub
		m.add(ob);
		
	}

	public static int getprice() {
		// TODO Auto-generated method stub
		if(m.size()>0) {
			
		for(product h:m) {
		price=(int) (price+ h.getprice());	
		}	
			
		}
		
		return price;
	}


	public void clearLinkList() {
		// TODO Auto-generated method stub
		m.clear();

	}}
