package type;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 20;
		float fNum = iNum;
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum = iNum+fNum;
		System.out.println(dNum);
		
		double dNum2 = 1.2;
		float fNum2 = 0.9F;
		int iNum2 = (int)dNum2+(int)fNum2;
		
		int iNum3 = (int)(dNum2+fNum2);
		
		
		System.out.println(iNum2);
		System.out.println(iNum3);
		
		
		
		double result = 0.0;
		for(int i=0;i<10;i++) {
			result += 0.1;
		}
		System.out.println(result);
		
		
		
		
	}

}
