int main (void) {
    float fchange = 0.00;
    int change = 0;
    printf ("How much change is owed? ");
    fchange = GetFloat ();
    change = (int) roundf (fchange *100.0);
    int quarters = change / 25;
    change = change % 25;
    int dimes = change / 10;
    change = change % 10;
    int nickels = change / 5;
    change = change % 5;
    printf ("%d quarters, %d dimes, %d nickels, %d pennies\n", quarters, dimes, nickels, change);
    return 0;
}


 int main(void) {
    double fchange = 0.00;
    int change;
    printf("How much change is owed? ");
    scanf("%lf", &fchange);
    
    change = (int) (fchange * 100); //convert double to int
    int quarters = change / 25;
    change %= 25;
    int dimes = change / 10;
    change %= 10;
    int nickels = change / 5;
    change %= 5;
    printf("%d quarters, %d dimes, %d nickels, %d pennies\n", quarters, dimes, nickels, change);
    return 0;
}


