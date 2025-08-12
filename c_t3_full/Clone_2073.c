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
    do {
        clrscr ();
        menu ();
        get_food_choice();
        total_price();
        printf ("\n Do you want to order more? [1] Yes [2] No:");
        scanf ("%d", &choice);
        getchar ();
    } while (choice == 1);
    printf ("\n Total Price is: %0.2f", grandtotal);
    getch ();
}


