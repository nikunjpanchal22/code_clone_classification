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
    int order = 0;
    float grandtotal = 0.0;
    float total = 0.0;
    do {
        menu ();
        foods ();
        printf ("\n Do you want to order more? [1] Yes [2] No:");
        scanf ("%d", & order);
        getchar ();
        grandtotal += total;
    }
    while (order == 1);
    printf ("\n Total Price is: %0.2f", grandtotal);
    getch ();
}


