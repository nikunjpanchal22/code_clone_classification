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
        float temp1 = getTemperature(); 
        String scale1 = getInitialScale(); 
        String scale2 = getFinalScale (); 
        System.out.print ("Your final temp is: " + convertTemperature(temp1, scale1, scale2) + ' ' + scale2); 
    } while (cont =='N');
}


