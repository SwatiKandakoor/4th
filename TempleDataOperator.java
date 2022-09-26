class TempleDataOperator{
	
 static	String[] save={null,null,null,null,null,null};
 static	int position=0;
	static void name(String value){
		save[position]=value;
	System.out.println(value);
	
         position++;
	}    
	  
	
	static void displayDetails(){
    for (int index=0;index<save.length;index++)
    {
		String ref=save[index];
		System.out.println(ref);
    }
	
  }
	

	
	public static void main(String[] args){
	System.out.println("main : nadita ide");
    String ref="Anginaya";
	String ref1="Sayibaba";
	String ref2="Iscon Temple";
	String ref3="Shanmuka Temple";
	String ref4="Kukke Subramanya";
	String ref5="Kashi Vishawanath";

   
    TempleDataOperator.name("Temple name :" +ref);
	TempleDataOperator.name("Temple name : "+ref1);
	TempleDataOperator.name("Temple name : "+ref2);
	TempleDataOperator.name("Temple name :"+ref3);
	TempleDataOperator.name("Temple name : "+ref4);
	TempleDataOperator.name("Temple name : "+ref5);
	
	System.out.println("...............................");
	TempleDataOperator.displayDetails();
	System.out.println("main : mugithu");
	}

}