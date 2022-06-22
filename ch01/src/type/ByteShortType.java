package type;

public class ByteShortType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 자료형
			
		byte bData = -128;  //1byte : -128 ~ 127 (256 == 2의8제곱)
//		byte bData2 = 128;	에러!
		
		System.out.println(bData);
		
		short sData = 32767;	//short : -32768 ~ 32767 (65536 == 2의 16제곱)
//		short sData2 = -32769;	에러!
		
		System.out.println(sData);
	}
}
