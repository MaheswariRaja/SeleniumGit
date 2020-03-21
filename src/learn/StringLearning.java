package learn;

public class StringLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I, am, a, super man";
		String str2 = "super";
		String str1 = new String(str);
		String str3 = str1.toUpperCase();
		
		//System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.charAt(3));
        System.out.println(str1.equals(str2));
        System.out.println(str1.contains("a"));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.startsWith("I"));
        System.out.println(str1.endsWith("n"));
        System.out.println(str1.compareTo(str3));
        //System.out.println(str1.split());
        String[] split = str1.split(",");
        for (String split1 : split) {
        	System.out.println(split1);
			
		}
        char[] strtochar = str1.toCharArray();
        //System.out.println("this is an array: " + strtochar);
        for (char c : strtochar) {
        	System.out.println(c);
			
		}
      
      
        
       

	}

}
