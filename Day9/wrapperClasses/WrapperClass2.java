package wrapperClasses;

public class WrapperClass2 {

//	 Autoboxing
	
	public static void main(String[] args) {
		
		System.out.println(
	            "Values of Wrapper objects (printing as objects)");
		
		byte a = 1;		 
        // wrapping around Byte object
//        Byte byteobj = Byte.valueOf(a);
		Byte byteObj = a;
        
        System.out.println("\nByte object byteobj: "
                + byteObj);
 
        // int data type
        int b = 10; 
        // wrapping around Integer object
        Integer intobj = b;
        System.out.println("\nInteger object intobj: "
                + intobj);       
        
 
        // float data type
        float c = 18.6f; 
        // wrapping around Float object
        Float floatobj = c;
        System.out.println();
        System.out.println("\nFloat object floatobj: "
                + floatobj);
 
        // double data type
        double d = 250.5; 
        // Wrapping around Double object
        Double doubleobj = d;
        
        System.out.println("\nDouble object doubleobj: "
                + doubleobj);
        
 
        // char data type
        char e = 'a'; 
        // wrapping around Character object
        Character charobj = e;
        System.out.println("\nCharacter object charobj: "
                           + charobj);
        
        
//        Unboxing
        
        System.out.println(
                "\nUnwrapped values (printing as data types)");
        
        byte bv = Byte.valueOf(byteObj);
        System.out.println("\nbyte value, bv: " + bv);
        
        int iv = intobj.intValue();
        System.out.println("\nint value, iv: " + iv);
        
        float fv = floatobj.floatValue();
        System.out.println("\nfloat value, fv: " + fv);
        
        double dv = doubleobj.floatValue();
        System.out.println("\ndouble value, dv: " + dv);
        
        char cv = charobj.charValue();
        System.out.println("\nchar value, cv: " + cv);
        
        int num = 123;
        
        String num1 = String.valueOf(num);
        
 
	}

}
