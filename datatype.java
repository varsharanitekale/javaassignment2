import java.util.Scanner;
public class datatype{
    public static void main( String[] args){
        Scanner a= new Scanner(System.in);
        System.out.println("enter your boolen");
        boolean b= a.nextBoolean();
        System.out.println(b);
        System.out.println("----------------");
        char chr=a.next().charAt(0);
        System.out.println(chr);

    
        System.out.println("-------------------------------------------------");
       System.out.println("enter int"); 
       int c= a.nextInt();
       System.out.println(c);
       System.out.println("-------------------");
       float d=a.nextFloat();
       System.out.println(d);

    }
}
