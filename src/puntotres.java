import java.util.Scanner;

public class puntotres {
    public void MIC(){

        Scanner sc = new Scanner(System.in);
        
        double altura, peso, mic;
        
        System.out.println("Ingrese su altura(m):");
        altura = sc.nextDouble();
        System.out.println("Ingrese su peso(kg):");
        peso = sc.nextDouble();
        
        mic = peso/(altura*altura);
        System.out.println(mic);
        if(mic <= 18.5){
            System.out.println("Delgado");
        }else if(mic > 18.5 && mic <= 24.9){
            System.out.println("Normal");
        }else if(mic > 24.9 && mic <= 29.9){
            System.out.println("Sobrepeso");
        }else{
            System.out.println("Obseidad");
        }
    }
}
