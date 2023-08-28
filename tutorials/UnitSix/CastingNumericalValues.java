package UnitSix;



public class CastingNumericalValues {

	public static void main(String[] args) {

		// 16 bit or byte
		short shortValue = 55;

		// 32 bit or 2 byte
		int intValue = 888;

		// -128 to 127 for 256 values including 0
		byte byteValue = 20;

		long longValue = 23555;
		float floatValue = 843.8f;
		float floatValue2 = (float) 99.3;
		double doubleValue = 32.4;

		// To find max and min size use Class
		// - Example Below
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		intValue = (int) longValue;

		System.out.println(intValue);

		doubleValue = intValue;
		System.out.println(doubleValue);
		
		// Casting just cuts off and doesnt round
		// To round is Math.round()
		intValue = (int) floatValue;
		System.out.println(intValue);
		
		
		// Will not work as expected too
		// 128 is too big for byte
		// So pay attention to caster and castee
		// and that memory sizes match up
		byteValue = (byte) 128;
		System.out.println(byteValue);
		

	}

}
