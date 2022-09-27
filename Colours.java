class Colours{
	static String[] names={null,null,null,null,null,null,null};
    static int position=0;
    static void data(String value){
	names[position]=value;
    System.out.println("colours names :"+value);
	position++;
	
	if(position>7){
		System.err.println("clours names exceed");
		return;
	}	
	}

	static void displayDetails(){
	for(int find=0;find<names.length;find++){
		if (names[find]!=null && names.length>6){
		System.out.println(names[find]);
	  }
	}
	
    }
	 
	static boolean search(String name){
		for(int index=0;index<names.length;index++){
		String ref=names[index];
	
		if(ref==name){
			System.out.println("Clours Found "+name);
			return true;
		
		  }
	
    }
	return false;
	}
	public static void main(String [] args)
	{
		System.out.println("main : nadita ide");
		System.out.println("<------------Creating for elemnts-------->");
		Colours.data("Orange");
		Colours.data("Yellow");
		Colours.data("White");
		Colours.data("Red");
		Colours.data("Pink");
		Colours.data("Black");
		Colours.data("Brown");
		System.out.println("<------------Reading for elemnts--------->");
		Colours.displayDetails();
		System.out.println("<---------Searching for elemnts---------->");
	    Boolean refName	=Colours.search("Green");
	    System.out.println("name found: "+refName);
		System.out.println("main: mugithu");
	}
}