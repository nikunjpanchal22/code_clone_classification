public static void main (String [] args) {
    char cont = 'E';
    do {
        temp1 = getTemp ();
        scale1 = scaleOne ();
        scale2 = toScale ();
        System.out.print ("Your final temp is: " + convert () + ' ' + scale2);
    } while (cont == 'N');
}


public static void main (String [] args) {
    char cont = 'E';
    do {
        temp3 = getTemp3 ();
        scale5 = scaleThree ();
        scale6 = toScaleThree ();
        System.out.print ("Your final temp is: " + convert () + ' ' + scale6);
    } while (cont == 'N');
}
