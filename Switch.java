import java.util.Scanner;

public class Switch{
    public static void main(String[] args){
        Scanner inputValor = new Scanner(System.in);
        System.out.println("Insira um valor entre 1 e 3");
        int valor = inputValor.nextInt();
        
        switch (valor){
            case 1:
                System.out.println("O valor inserido foi 1");
                break;
            case 2:
                System.out.println("O valor inserido foi 2");
                break;
            case 3:
                System.out.println("O valor inserido foi 3");
                break;
            default:
                System.out.println("Número inválido");
                break;
            
        }
    }
}