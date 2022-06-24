package nestedfor;

public class StarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  for (int i = 0; i < 10; i++){
			  for(int j = 0; j <=i; j++) {
				  System.out.print("*");
			  }
			  System.out.println("");
		    }
		  for (int k = 10; k > 0; k--) {
			  for(int n = 0; n < k;n++) {
				  System.out.print("*");
			  }
			  System.out.println("");
		  }
		  
		  
		  
		for(int a = 0; a <5;a++ ) {
			for(int b =0; b <5-a;b++) {
				System.out.print(" ");
			}for(int c = 0; c<a;c++) {
			System.out.print("*");
			}
			System.out.println("");
		}
					  
		
	

	
	
	}
			  
		  
		  }
