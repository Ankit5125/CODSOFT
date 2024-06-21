
package Task1;
import java.util.*;



public class NumberGame {
    static Scanner sc = new Scanner(System.in);
    public static int check(int num, int n){
        int count = 0 ;

        while(num != n){
            if(num > n){
                System.out.print("Please Choose Small Number...    : ");
                num = sc.nextInt();
                count++;
            }
            else if(num < n){
                System.out.print("Please Choose Large Number...   : ");
                num = sc.nextInt();
                count++;
            }

        }
        System.out.println("Congratulations !! You Guessed The Right Numer...");

        System.out.println("You Took : " + count + " Chance");
        return count;
    }

    public static void declareResult(int n1 , int n2, String name1 , String name2 ){
        System.out.println("\n\n\nResult : ");
        if(n1 > n2)
            System.out.println(name2 + " Wins !! ");

        else
            System.out.println(name1 + " Wins !! ");

    }

    public static void main(String[] args) {

        Random ran = new Random();

        System.out.println("\nThis Game is Two Players Game...\n");
        System.out.print("Before Starting Game, Please Enter Your Name : ");
        String name1 = sc.next();

        System.out.print("Enter Another Players Name : ");
        String name2 = sc.next();


        System.out.println("\n\n\n" + name1 + "'s Turn : ");
        int n1 = ran.nextInt(1, 100);

        System.out.println("\nComputer Has Choosen number..");
        System.out.print("\n\nEnter your Guessed Number : ");
        int num1 = sc.nextInt();

        int attempt1 = check(num1 , n1);

        System.out.println("\n\n\n" + name2 + "'s Turn : ");
        int n2 = ran.nextInt(1, 100);

        System.out.println("\nComputer Has Choosen number..");
        System.out.print("\n\nEnter your Guessed Number : ");
        int num2 = sc.nextInt();

        int attempt2 = check(num2 , n2);

        declareResult(attempt1 , attempt2 , name1 , name2);

    }
}
