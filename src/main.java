import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Random rand = new Random();
        int number = rand.nextInt(100);
        // double number = Math.random()* 100;

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin= false;
        boolean isWrong = false;
        int i = 0;
        while (right < 5){
            System.out.println("Please enter the guess : ");
            selected = input.nextInt();
            if(selected < 0 || selected > 99){
                System.out.println("Please enter the number in 0 - 100");
                if(isWrong){
                    right++;
                    System.out.println("You entered many wrong number . Your right count : "+(5- right));

                }else {
                    isWrong = true;
                    System.out.println("If you will enter the incorrect number your right will decrease.  ");
                }
                continue;
            }
            if(selected == number){
                System.out.println("Congrats right guess ! Your guess : "+ number);
                isWin = true;
                break;
            }else{

                System.out.println("Wrong number. ");
                if(selected> number){
                    System.out.println(selected+" number, is bigger than secret number. ");
                }else{
                    System.out.println(selected+ " number is smaller than secret number .");
                }
                wrong[right]=selected;
                right++;
                System.out.println("Right count: "+(5-right));
            }

        }
        if(!isWin){
            System.out.println("You lose ! ");
            if(!isWrong) {
                System.out.println("Your guesses : " + Arrays.toString(wrong));
            }
        }

    }
}
