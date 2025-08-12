public static void main (String [] args) {
    char cont = 'E';
    do {
        temp1 = getTemp ();
        scale1 = scaleOne ();
        scale2 = toScale ();
        System.out.print ("Your final temp is: " + convert () + ' ' + scale2);
    } while (cont == 'N');
}





public class Main {
    public static void main(String[] args) {
        char cont = 'E';
        do {
            double temp1 = getTemperatureInput();
            char scale1 = getOriginalScale();
            char scale2 = getTargetScale();
            System.out.print ("Your final temp is: " + tempConversion(temp1, scale1, scale2) + ' ' + scale2);
        } while (cont == 'N');
    }
}


