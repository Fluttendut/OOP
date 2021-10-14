import java.util.Scanner;

public class Main
{
    private static Scanner scanner = new Scanner(System.in);
    private static final int TICKETPRICE = 150;
    private static boolean run = true;

    public static void main(String[] args)
    {
        Band bandOne = new Band("Panic! at the Disco");
        Band bandTwo = new Band("Fall Out Boy");
        Band bandThree = new Band("Skillet");
        Band bandFour = new Band("Maroon 5");

        Concert panicAtTheDisco = new Concert(500, "7 Langley mere, NE12 7FN Newcastle upon Tyne", "10/12/2021 - 9PM", bandOne);
        Concert fallOutBoy = new Concert(450, "7 Langley mere, NE12 7FN Newcastle upon Tyne", "11/12/2021 - 9PM", bandTwo);
        Concert skillet = new Concert(380, "7 Langley mere, NE12 7FN Newcastle upon Tyne", "17/12/2021 - 9PM", bandThree);
        Concert maroon5 = new Concert(665, "7 Langley mere, NE12 7FN Newcastle upon Tyne", "18/12/2021 - 9PM", bandFour);



        while (run == true)
        {
            System.out.println("What band do you want to buy tickets to?");
            System.out.println("Press 1 for: Panic! at the Disco");
            System.out.println("Press 2 for: Fall Out Boy");
            System.out.println("Press 3 for: Skillet");
            System.out.println("Press 4 for: Maroon 5");

            int input = scanner.nextInt();

            switch (input)
            {
                case 1:
                    System.out.println("You have picked: Panic! at the Disco\nThere are " + panicAtTheDisco.getSeats() + " tickets available, how many would you like to buy?");
                    break;
                case 2:
                    System.out.println("You have picked: Fall Out Boy\nThere are " + fallOutBoy.getSeats() + " tickets available, how many would you like to buy?");
                    break;
                case 3:
                    System.out.println("You have picked: Skillet\nThere are " + skillet.getSeats() + " tickets available, how many would you like to buy?");
                    break;
                case 4:
                    System.out.println("You have picked: Maroon 5\nThere are " + maroon5.getSeats() + " tickets available, how many would you like to buy?");
                    break;
                default:
                    System.out.println("Please only choose a number from 1 - 4");
            }
            int ticketAmount = scanner.nextInt();
            if (input == 1 && panicAtTheDisco.getSeats()>= ticketAmount)
            {
                int startPanic = panicAtTheDisco.getSeats();
                int endPanic = startPanic - ticketAmount;
                panicAtTheDisco.setSeats(endPanic);
                //Add print
                System.out.println("You picked " + ticketAmount + " tickets. The price is: " + (TICKETPRICE * ticketAmount) + "\nHere is the time and date:\n" + panicAtTheDisco.getAddress() + "\n" + panicAtTheDisco.getTime() + "\nHave a nice day!\n\n\n");
            }

            else if (input == 2 && fallOutBoy.getSeats()>= ticketAmount)
            {
                int startFall = fallOutBoy.getSeats();
                int endFall = startFall - ticketAmount;
                fallOutBoy.setSeats(endFall);
                System.out.println("You picked " + ticketAmount + " tickets. The price is: " + (TICKETPRICE * ticketAmount) + "\nHere is the time and date:\n" + fallOutBoy.getAddress() + "\n" + fallOutBoy.getTime() + "\nHave a nice day!\n\n\n");
            }
            else if (input == 3 && skillet.getSeats()>= ticketAmount)
            {
                int startSkill = skillet.getSeats();
                int endSkill = startSkill - ticketAmount;
                skillet.setSeats(endSkill);
                System.out.println("You picked " + ticketAmount + " tickets. The price is: " + (TICKETPRICE * ticketAmount) + "\nHere is the time and date:\n" + skillet.getAddress() + "\n" + skillet.getTime() + "\nHave a nice day!\n\n\n");
            }

            else if (input == 4 && maroon5.getSeats()>= ticketAmount)
            {
                int startMaroon = maroon5.getSeats();
                int endMaroon = startMaroon - ticketAmount;
                maroon5.setSeats(endMaroon);
                System.out.println("You picked " + ticketAmount + " tickets. The price is: " + (TICKETPRICE * ticketAmount) + "\nHere is the time and date:\n" + maroon5.getAddress() + "\n" + maroon5.getTime() + "\nHave a nice day!\n\n\n");
            }
            else
            {
                System.out.println("There ain't enough tickets.😑\n\n\n");

            }
        }
    }
}
