import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void checkAge(int age) throws AgeCheckException{
        if (age < 18){
            throw new AgeCheckException("Yaş hatası alındı");
        }
        System.out.println("Yaş uygundur");
    }

    public static void main(String[] args) throws AgeCheckException{
        System.out.println("Program Başladı");
        Scanner input = new Scanner(System.in);
        System.out.print("Yaşını giriniz : ");
        int age = input.nextInt();

        checkAge(age);

        /*
        try {
            int age = input.nextInt();
            checkAge(age);
            System.out.println("Program Bitti");
        }catch (Exception e){
            System.out.println("Yaşı uymuyor");
        }
        */

    }
}