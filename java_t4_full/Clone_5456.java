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
    char cont; 
    do { 
        int temp1 = getTemperature (); 
        char scale1 = getFirstScale (); 
        char scale2 = getSecondScale (); 
        System.out.print ("Your final temp is: " + convert(temp1, scale1, scale2) + ' ' + scale2); 
        cont = userContinue();
    } while (cont=='N');
}


