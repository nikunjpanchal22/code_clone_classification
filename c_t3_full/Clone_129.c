void main () {
    clrscr ();
    do {
        menu ();
        foods ();
        printf ("\n Do you want to order more? [1] Yes [2] No:");
        scanf ("%d", & choice);
        getchar ();
        grandtotal = grandtotal + total;
    }
    while (choice == 1);
    printf ("\n Total Price is: %0.2f", grandtotal);
    getch ();
}


 void main () {
    clrscr ();
    int ordermore = 0;
    double grandtotal = 0;
    double subtotal = 0;
    do {
        menu ();
        foods ();
        printf ("\n Do you want to order more? [1] Yes [2] No:");
        scanf ("%d", & ordermore);
        getchar ();
        grandtotal += subtotal;
    }
    while (ordermore == 1);
    printf ("\n Total Price is: %0.2lf", grandtotal);
    getch ();
}


