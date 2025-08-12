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
    double grandtotal = 0.0;
    int choice;
    while (1) {
        clrscr ();
        menu ();
        grandtotal += foods ();
        printf ("\n Do you want to order more? [1] Yes [2] No:");
        scanf ("%d", &choice);
        getchar ();
        if (choice != 1) break;
    }
    printf ("\n Total Price is: %0.2f", grandtotal);
    getch ();
}


