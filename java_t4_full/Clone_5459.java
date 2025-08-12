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
            double temp1 = readTemp();
            String scale1 = readScale();
            String scale2 = selectScale();
            System.out.print ("Your final temp is: " + updatedTemp(temp1, scale1, scale2) + ' ' + scale2);
        } while (cont == 'N');
    }
}


