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
        int temp1 = getTemperatureReading (); 
        char scale1 = getCurrentScale (); 
        char scale2 = getTargetScale (); 
        System.out.print ("Your final temp is: " + performConversion(temp1, scale1, scale2) + ' ' + scale2); 
    } while (cont != 'Y');
}


