class Product {
	public static void main(String[] args){
		String name=args[0];
		String type=args[1];
		String price=args[2];
		String quantity=args[3];
		String quality=args[4];
		String price1=args[5];
		
		System.out.println("The Product name is :"+name);
		System.out.println("The Product Type is :"+type);
		System.out.println("The Product Price is :"+price);
		System.out.println("The Product Quantity is :"+quantity);
		System.out.println("The Product Quality is :"+quality);
		System.out.println("The Price is :"+price1);
		
		int ref=Integer.parseInt(price);
		int ref1=Integer.parseInt(quantity);
		int ref2=Integer.parseInt(price1);
		
		System.out.println(ref);
		System.out.println(ref1);
		System.out.println(ref2);
		
		if(ref<=50){
			System.out.println("The milk price is :"+ref);
			
	     }
		 else{
			 System.out.println("This is not milk price :"+ref);
			 
		 }
		 if(ref2<=60){
			System.out.println("The milk price is :"+ref2);
			
	     }
		 else{
			 System.out.println("This is not milk price :"+ref2);
		 }
		 if(ref1<=1){
			System.out.println("The quantity is :"+ref1);
			
	     }
		 else{
			 System.out.println("not a correct quantity");
		 }
		 int total=ref+ref2;
		 System.out.println(total);
		
	}
}