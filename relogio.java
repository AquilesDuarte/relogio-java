import java.time.LocalTime;
import java.util.Scanner;

public class relogio {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);


        System.out.println("Welcome to the clock virtual");

        System.out.println("Type your name and let's find out the time");
        scan.nextLine();

        System.out.println(LocalTime.now());

        LocalTime horaAtual = LocalTime.now();
        int hora = horaAtual.getHour();

        if(hora >= 01 && hora < 12){
            System.out.println("Good morning!");
        } else if(hora >= 12 && hora < 18){
            System.out.println("Good afternoon!");
        } else if(hora >= 18 && hora < 24){
            System.out.println("Good night!");
        }
    }
}