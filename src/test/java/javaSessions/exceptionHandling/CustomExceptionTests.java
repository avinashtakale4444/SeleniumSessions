package javaSessions.exceptionHandling;

public class CustomExceptionTests {

    public static int testName(String name) {
        int d=0;
       if(name.equalsIgnoreCase("avinash")){
           try{
               int c=98/2;
               d= 80;
           }catch (Exception e){
               d= 60;
           }finally {
               d= 10;
           }
       }
        return d;
    }

    public static void main(String[] args) {
        int a=testName("avinash");
        System.out.println(a);
    }
}
