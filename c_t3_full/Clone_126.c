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
    int option = 0;
    float grandtotal = 0.0f;
    float total = 0.0f;
    do {
        menu ();
        foods ();
        printf ("\n Do you want to order more? [1] Yes [2] No:");
        scanf ("%d", & option);
        getchar ();
        grandtotal += total;
    }
    while (option == 1);
    printf ("\n Total Price is: %.2f", grandtotal);
    getch ();
}


