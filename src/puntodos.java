import java.util.Scanner;
public class puntodos {
    public void IMC(){
       Scanner scanner = new Scanner(System.in);
        int num, temporal, sw1=0, sw2=1;

       System.out.println("Ingrese un número");
       num = scanner.nextInt();
        
       for(int i = 0 ; i < num; i++) {
            System.out.println(sw1);
            temporal = sw1 + sw2;
            sw1=sw2;
            sw2=temporal;
       }

    }

}
