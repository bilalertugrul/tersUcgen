import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı: ");
        number = input.nextInt();

        for(int i = number; i>=0 ; i--){
            for(int j = 0; j<=(number-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}