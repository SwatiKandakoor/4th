class Billionaries{
	static String[] names={null,null,null,null,null,null,null,null,null,null};
	static int position=0;
	static void data(String value){
		if (position>10){
			System.err.println("Billionaries is exced");
			return;
		}
		
		names[position]=value;
		System.out.println("Billionaries name :"+value);
		position++;
		
	}
	static void displayDetails(){
		for(int point=0;point<names.length;point++){
			if(names[point]!=null && names.length>9){
		System.out.println(names[point]);
		}
	}
	}
	static boolean search(String name){
		for(int i=0;i<names.length;i++){
			String ref=names[i];
			if (ref==name){
				System.out.println("Billionaries "+ref);
				return true;
			}
		}
     return false;
	}
	static void update(String oldName, String newName){
		if(oldName!=null && newName!=null){
			if(oldName.length()>4 && newName.length()>4){
		
			
			for(int point=0;point<names.length;point++){
				
				String ref=names[point];
				//System.out.println(names[point]);
				if(ref==oldName){
					names[point]=newName;
				System.out.println("new Name:"+newName + " & old name: "+oldName );
							//System.out.println(newName);
							System.out.println("-------checking---------");
								displayDetails();
				return ;
				} 
			

			
		    }
			
			}
			
		}
		
	}
	static String update(int index , String newBillionarie){
		if(newBillionarie!=null){
			
				names[index]=newBillionarie;
				
			    System.out.println(newBillionarie);
			   
			displayDetails();
				
			   
		}
		return "true";
		
	}
	static boolean delete(String newName){
		
		if(newName.length()>3){
			for(int index=0;index<names.length;index++){
				if(index==3){
					String ref3=names[index];
					names[index]=null;
					System.out.println(names[index]);	
					displayDetails();
				}
			}
		}
			return false;
		}
		static boolean delete(int index ,String billionarie){
		if (billionarie!=null){
			for(int point=0;point<names.length;point++){
			if (index==7){
				String ref4=names[point];
				names[point]=billionarie;
				System.out.println(billionarie);
				displayDetails();
				return true;
				
			   }	
			}
		}
		return false;
	}
		
	

	
	
	public static void main(String [] args){
		System.out.println("------Creating for elements------");
		Billionaries.data("Elon Musk");
		Billionaries.data("Bernard Arnault");
		Billionaries.data("Gautam Adani");
		Billionaries.data("Jeff Bezos");
		Billionaries.data("Bill Gates");
		Billionaries.data("Warren Buffett");
		Billionaries.data("Mukesh Ambani");
		Billionaries.data("Sergey Brin");
		Billionaries.data("Larry Ellison");
		Billionaries.data("Larry Page");
		
		
		System.out.println("-----Reading for elements------");
		Billionaries.displayDetails();
		System.out.println("-----searching for elements-----");
		boolean ref=Billionaries.search("Elon Musk");
        System.out.println(ref);
		System.out.println("-----updating for elements-----");
		Billionaries.update("Bill Gates","Swati");
		
		System.out.println("------index updating----------");
		String newBillionarie="Warren Buffett";
		String newName=Billionaries.update(2,newBillionarie);
	    System.out.println(newName);
		
		System.out.println("-------delete----------------");
		String ref10="Jeff Bozes";
		boolean ref3=Billionaries.delete(ref10);
		System.out.println(ref3 );
		
		System.out.println("-------delete using index----------------");
		boolean ref4=Billionaries.delete("Mukesh Ambani");
		System.out.println(ref4);
    }
}
	
	  