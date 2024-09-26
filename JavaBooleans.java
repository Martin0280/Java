public class JavaBooleans {

    public static void main(String args[]) {
        boolean isJavaFun = false;
        boolean isTheFoodGood = true;
        
        System.out.println("isJavaFun");
        System.out.println("isTheFoodGood");

        int x = 10;
        int y = 9;
        System.out.println(x > y);
        System.out.println(x == 10);
        System.out.println(x == 15);
        
        int Age = 25;
        int VotingAge = 18;
        
        
        if(Age >= VotingAge) {
            System.out.println("Old enough to vote");
        }else{ 
            System.out.println("Not old enough to vote");}
    }
}
