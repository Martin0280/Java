public class JavaString {

    public static void main(String args[]) {
        String txt = "i love to code Java"; 
        System.out.println("The length of the text is: " +txt.length());
        
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        
        System.out.println(txt.indexOf("J"));
        
        String x = "10";
        String y = "20";
        String z = x + y;
        System.out.println(z);

    }
}
