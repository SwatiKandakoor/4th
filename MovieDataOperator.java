class MovieDataOperator{
	
	static	String[] names={null,null,null,null,null,null,null};
    static	int position=0;
	static void save(String value){
		names[position]=value;
	System.out.println(value);
	
         position++;
	}    
	  
	
	static void displayDetails(){
    for (int index=0;index<names.length;index++)
    {
		String ref=names[index];
		System.out.println(ref);
    }
	
  }
	

	
	public static void main(String[] args){
	System.out.println("main : nadita ide");
    String ref="RRR";
	String ref1="KGF";
	String ref2="Charlie 777";
	String ref3="Old Monk";
	String ref4="Love MOktail2";
	String ref5="Bhajarangi";

   
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