package week1.day2;

public class Mobile {
	String mobileBrandName="realme";
	char mobileLogo='r';
	short noOfMobilePiece=1;
	int modelNumber=6;
	long imeiNumber=12456782345678l;
	float mobilePrice=12999.00f;
	boolean isDamaged=false;
	
	
	
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		System.out.println("mobileBrandName="+mob.mobileBrandName);
		System.out.println("mobileLogo="+mob.mobileLogo);
		System.out.println("noOfMobilePiece="+mob.noOfMobilePiece);
		System.out.println("modelNumber="+mob.modelNumber);
		System.out.println("imeiNumber="+mob.imeiNumber);
		System.out.println("mobilePrice="+mob.mobilePrice);
		System.out.println("isDamaged="+mob.isDamaged);
		
	}

    

}
