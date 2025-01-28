import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int forcaXP;
        String forca;
        System.out.println("Digite um nome do seu Heroi;");
        String nome = sc.nextLine();

        do {
            System.out.println("Digite o XP do seu Heroi;");
            forcaXP = sc.nextInt();

        }while (forcaXP < 0) ;

        if(forcaXP < 1000 ){
            forca = ("Ferro");
        }else if(forcaXP > 1001 && forcaXP < 2000){
            forca = ("Bronze");
        }else if(forcaXP > 2001 && forcaXP < 5000){
            forca = ("Prata");
        }else if(forcaXP > 5001 && forcaXP < 7000){
            forca = ("Ouro");
        }else if(forcaXP > 7001 && forcaXP < 8000){
            forca = ("Platina");
        }else if(forcaXP > 8001 && forcaXP < 9000){
            forca = ("Ascendente");
        }else if(forcaXP > 9001 && forcaXP < 10000){
            forca = ("Imortal");
        }else{
            forca = ("Super saiyajin Radiante");
        }
        System.out.printf("O Herói de nome %s esta no nível de %s.",nome,forca);
    }
}
