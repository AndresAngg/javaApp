import java.util.Scanner;
public class puntouno {
    public void main(){
        double ladoA, ladoB, ladoC;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del lado A:");
        ladoA = sc.nextDouble();
        System.out.println("Ingrese el valor del lado B:");
        ladoB = sc.nextDouble();
        System.out.println("Ingrese el valor del lado B:");
        ladoC = sc.nextDouble();

        if(ladoA == ladoB && ladoB == ladoC){
            System.out.println("El triangulo es equilatero");
        }else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
            System.out.println("El triangulo es isocesles");
        }else{
            System.out.println("El triiangulo es escaleno");
        }
    }
}
