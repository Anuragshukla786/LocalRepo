import java.util.*;
public class FarenheitToCelsius {
    public static void main(String[] args) {
        float temperature;
        Scanner sc=new Scanner (System.in);
        
        
        System.out.println("Enter Temperature in Farenheit:");
        temperature=sc.nextFloat();

        temperature=((temperature -32)*5)/9;
        System.out.println("Temperatuer in Celsius:"+temperature);
        sc.close();

    }
    
}
