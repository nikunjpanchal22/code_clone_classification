public static void main (String [] args) {
    char cont = 'E';
    do {
        temp1 = getTemp ();
        scale1 = scaleOne ();
        scale2 = toScale ();
        System.out.print ("Your final temp is: " + convert () + ' ' + scale2);
    } while (cont == 'N');
}





public static void main (String [] args){ 
    char cont = 'E'; 
    do { 
        float temp1 = inputTemp();
        String scale1 = inputScale();
        String scale2 = desiredScale();
        System.out.print ("Your final temp is: " + convert(temp1, scale1, scale2) + ' ' + scale2);
    } while (cont == 'N');
}


