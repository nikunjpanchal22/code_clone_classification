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
        temp2 = getTemp2 ();
        scale3 = scaleTwo ();
        scale4 = toScaleTwo ();
        System.out.print ("Your final temp is: " + convert () + ' ' + scale4);
    } while (cont == 'N');
}
