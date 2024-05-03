import java.util.Random;
import java.util.Scanner;

public class RPS {

    public static void main( String args[] ) {



        String[] myarray = {"ROCK","PAPER","SCISSOR"};

        Scanner myRound = new Scanner(System.in);

        System.out.print("Enter Number of Rounds: ");

        int round = myRound.nextInt();

        int cpu = 0;

        int player = 0;

        for(int i = 0; i<round; i++){

            Random randomno = new Random();



            // check next int value

            int r = randomno.nextInt(3);

            Scanner myObj = new Scanner(System.in);

            System.out.print("Enter Player Input: ");

            String b = myObj.nextLine().toUpperCase();

            String a = myarray[r];



            System.out.println("CPU: " + myarray[r]);



            if(a.equals(b)){

                System.out.println("Tie");

            }

            else if(a.equals(myarray[0]) && b.equals(myarray[2]) || a.equals(myarray[2]) && b.equals(myarray[1]) || a.equals(myarray[1]) && b.equals(myarray[0])) {

                cpu++;

                System.out.println("CPU wins");



            }

            else if(b.equals(myarray[0]) && a.equals(myarray[2]) || b.equals(myarray[2]) && a.equals(myarray[1]) || b.equals(myarray[1]) && a.equals(myarray[0])) {

                player++;

                System.out.println("Player wins");

            }

            else{

                System.out.println("Invalid input");

            }



        }

        System.out.println("Player:" + player +"\nCPU:" + cpu);

    }

}
