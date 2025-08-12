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
        double temp1 = fetchTemp(); 
        char scale1 = fetchScaleOne(); 
        char scale2 = fetchToScale(); 
        System.out.print ("Your final temp is: " + convertScale(temp1, scale1, scale2) + ' ' + scale2); 
    } while (cont == 'N'); 
}


