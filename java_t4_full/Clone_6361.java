public static void main (String [] args) {
    final double length;
    final double width;
    final char typeOfFrame;
    final char choiceOfColor;
    System.out.println ("Please enter the length of your picure in inches:");
    length = console.nextDouble ();
    System.out.println ("Please enter the width of your picure in inches: ");
    width = console.nextDouble ();
    System.out.println ("Please enter the type of frame: R or r (Regular), F or f (Fancy). ");
    typeOfFrame = console.next ().charAt (0);
    System.out.println ("Would you like to add color?: Y for (Yes), N for (No): ");
    choiceOfColor = console.next ().charAt (0);
    if (! (isFrameType (typeOfFrame))) {
    } else {
        final double area;
        final double perimeter;
        final double priceOfFrame;
        final double priceOfCardboard;
        final double priceOfGlass;
        area = (length * width);
        perimeter = (2 * length) + (2 * width);
        priceOfFrame = (perimeter * REGULAR_FRAME);
        priceOfCardboard = (area * CARDBOARD);
        priceOfGlass = (area * GLASS);
        if (isValidChoice (choiceOfColor)) {
            final double priceOfColor;
            final double finalPrice;
            final char choiceOfCrowns;
            final double grandTotalPrice;
            if (choiceOfColor == 'N') {
                finalPrice = (priceOfFrame + priceOfCardboard + priceOfGlass);
            } else {
                priceOfColor = (area * COLOR);
                finalPrice = (priceOfFrame + priceOfColor + priceOfCardboard + priceOfGlass);
            }
            System.out.println ("Would you like to add crowns? Enter Y (Yes), or N (No): ");
            choiceOfCrowns = console.next ().charAt (0);
            if (isValidChoice (choiceOfCrowns)) {
                if (choiceOfCrowns == 'Y') {
                    final double crownFinalPrice;
                    final int numberOfCrowns;
                    System.out.println ("How many crowns would you like? ");
                    numberOfCrowns = console.nextInt ();
                    crownFinalPrice = (numberOfCrowns * CROWNS);
                    grandTotalPrice = (crownFinalPrice + finalPrice);
                } else {
                    grandTotalPrice = finalPrice;
                }
                System.out.printf ("Your total comes to: $%.2f%n", grandTotalPrice);
            }
        }
    }
}





import java.util.Scanner;
public class Main {
    private static final double REGULAR_FRAME = 15.0;
    private static final double FANCY_FRAME = 20.0;
    private static final double CARDBOARD = 10.0;
    private static final double GLASS = 5.0;
    private static final double COLOR = 2.0;
    private static final double CROWNS = 1.0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	if(enterData(sc)) {
		System.out.println("\nYou chose to exit. Goodbye.");
	} else {
		System.out.println("\nSomething went wrong. Please try again.");
	}
	sc.close();
    }

    private static boolean isFrameType(char typeOfFrame) {
	return typeOfFrame == 'R' || typeOfFrame == 'r' || typeOfFrame == 'F' || typeOfFrame == 'f';
    }

    private static boolean isValidChoice(char answer) {
	return answer == 'Y' || answer == 'y' || answer == 'N' || answer == 'n';
    }

    private static boolean enterData(Scanner console) {
	double length, width;
	char typeOfFrame, choiceOfColor;
	System.out.print("Please enter the length of your picture in inches: ");
	length = console.nextDouble();
	System.out.print("Please enter the width of your picture in inches: ");
	width = console.nextDouble();
	console.nextLine();
	System.out.print(
		"Please enter the type of frame: R or r (Regular), F or f (Fancy), X or x to exit:");
	typeOfFrame = console.nextLine().charAt(0);
	if (typeOfFrame == 'X' || typeOfFrame == 'x') {
		return true;
	} else if (!isFrameType(typeOfFrame)) {
		return false;
	}
	System.out.print("Would you like to add color?: Y for (Yes), N for (No), X or x to exit: ");
	choiceOfColor = console.nextLine().charAt(0);
	if (choiceOfColor == 'X' || choiceOfColor == 'x') {
		return true;
	} else if (!isValidChoice(choiceOfColor)) {
		return false;
	}
	calculatePrice(length, width, typeOfFrame, choiceOfColor, console);
	return true;
    }

    private static void calculatePrice(double length, double width, char typeOfFrame, char choiceOfColor,
	    Scanner console) {
	double area, perimeter, priceOfFrame, priceOfCardboard, priceOfGlass, priceOfColor = 0, finalPrice,
		grandTotalPrice;
	area = (length * width);
	perimeter = (2 * length) + (2 * width);
	priceOfFrame = (typeOfFrame == 'R' || typeOfFrame == 'r') ? (perimeter * REGULAR_FRAME)
		: (perimeter * FANCY_FRAME);
	priceOfCardboard = (area * CARDBOARD);
	priceOfGlass = (area * GLASS);
	if (choiceOfColor == 'Y' || choiceOfColor == 'y') {
	    priceOfColor = (area * COLOR);
	}
	finalPrice = (priceOfFrame + priceOfColor + priceOfCardboard + priceOfGlass);
	calculateCrown(finalPrice, console);
    }

    private static void calculateCrown(double finalPrice, Scanner console) {
	double crownFinalPrice = 0, grandTotalPrice;
	char choiceOfCrowns;
	System.out.print("Would you like to add crowns? Enter Y (Yes), or N (No), X or x to exit: ");
	choiceOfCrowns = console.nextLine().charAt(0);
	if (choiceOfCrowns == 'X' || choiceOfCrowns == 'x') {
		return;
	} else if (!isValidChoice(choiceOfCrowns)) {
		System.out.println("\nInvalid option. Try again.");
	}
	if (choiceOfCrowns == 'Y' || choiceOfCrowns == 'y') {
	    System.out.print("How many crowns would you like?: ");
	    crownFinalPrice = (console.nextInt() * CROWNS);
	}
	grandTotalPrice = (crownFinalPrice + finalPrice);
	System.out.printf("\nYour total comes to: $%.2f%n", grandTotalPrice);
    }
}


