
import java.util.Scanner;

public class Driver
{

    public static void main(String[] args)
    {


        Scanner input = new Scanner(System.in);
        EspressoMachine machine = new EspressoMachine();
        

        System.out.print("Enter the max capacity (in ounces): "); // ask the user to enter desired max capacity
        machine.setMaxGroundsCapacity(input.nextDouble());

        System.out.print("Enter the current level (in ounces): "); // ask the user to enter the desired current level
        machine.setCurrentGroundsLevel(input.nextDouble());




        while(true) // while loop to repeat messages
        {

            //prints like of the current ounces
            System.out.println("{Ounces per cup: " + machine.getOuncesPerCup() + " MaxGroundsCapacity:" + machine.getMaxGroundsCapacity() + " CurrentGroundsLevel:" + machine.getCurrentGroundsLevel() +"}");

            System.out.print("Enter Option number (1) Order cup (2) Add grounds (3) Quit: " ); // user inputs the option desired
            int option = input.nextInt();


            if (option == 1) // checks if the current level has enough grounds to make a coffee
            {

                if (machine.getCurrentGroundsLevel() <= machine.getOuncesPerCup()) // if not enough will output..
                {
                    System.out.println(machine.getOrderCupOfEspresso()); //
                }


                else if (machine.getCurrentGroundsLevel() >= machine.getOuncesPerCup() ) // if enough will output ..
                {

                    System.out.println(machine.getToString()); // and subtract the current ounces
                    machine.getAddgrounds();

                }

            }


            if (option == 2) // input the number of ounces desired to add to current ounces
            {

                System.out.print("Enter the # of ounces to add : ");
                machine.setCurrentGroundsLevel(input.nextDouble());

            }


            if (option == 3) // will stop the program
            {

                break;
            }

        }








    }

}
