package consultation_03;

import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String beast = scanner.nextLine();
        String dish = scanner.nextLine();

        boolean canBring = (beast.charAt(0) == dish.charAt(0))
                && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);

        String newBeast = beast.substring(0, 1) + beast.charAt(beast.length() - 1  );
        String newDish = dish.substring(0, 1) + dish.charAt(dish.length() - 1);

        canBring = newBeast.equals(newBeast);


    }
}
