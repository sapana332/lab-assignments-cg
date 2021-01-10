package labassignment3;
/**
*  Create a class containing a method to create the mirror image of a String. 
*  The method should return the two Strings separated with a pipe(|) symbol .

*/

	public class Exercise2 {

		public static void main(String[] args)
	    {
	        String input = "EARTH";
	 
	        // getBytes() method to convert string
	        // into bytes[].
	        byte[] strAsByteArray = input.getBytes();
	 
	        byte[] result = new byte[strAsByteArray.length];
	 
	        // Store result in reverse order into the
	        // result byte[]
	        for (int i = 0; i < strAsByteArray.length; i++)
	            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
	 
	        System.out.println(input+"|"+new String(result));
	    }
	

	}


