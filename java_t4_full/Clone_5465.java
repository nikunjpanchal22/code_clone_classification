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
        double temp1 = getTemp(); 
        char scale1 = getScale(); 
        char scale2 = getDestScale(); 
        System.out.print ("Your final temp is: " + convertTemp(temp1, scale1, scale2) + ' ' + scale2); 
    } while (cont != 'Y');
}


