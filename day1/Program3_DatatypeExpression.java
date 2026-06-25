package day1;

public class Program3_DatatypeExpression {
	
	public static void main(String[] args) {
		//boolean takes 1 bit	
		boolean result=false;
		System.out.println(result);
		
		//byte takes 1 byte = 128bits
		//-128 to +128
		byte ans=-128;
		System.out.println(ans);
		
		//short takes 2 byte
		//-32000 to 32000
		short data=-32000;
		System.out.println(data);
		
		
	    //char takes 2 bytes
		char alpha='A';
		System.out.println(alpha);
		
		long phonenumber=1234567890L;
		System.out.println(phonenumber);
		
		float mark1=987.12345890988F;
		System.out.println(mark1);
		
		
		float mark2 = 9.12345634123545345F;
		System.out.println(mark2);
		
		double data3 = 123.198663545349237943;
		System.out.println(data3);
		
		char alphab ='A';
		int value = alphab;
		System.out.println("ASCII CODE: "+value);
		
		
		float height = 162.4f;
		int heightInt = (int) height;
		System.out.println(heightInt);
		
		int age=32;
		float agefloat=age;
		System.out.println(agefloat);
		
			
	}

}
