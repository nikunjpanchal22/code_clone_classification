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
    float fchange = 0.00;
    int change;
    printf("How much change is owed? ");
    scanf("%f",&fchange);
    int x = (int) (fchange*100); // conversions
    change = x;
    int quarters = change/25; 
    change = change - (quarters*25); 
    int dimes = change/10;
    change = change - (dimes*10);
    int nickels = change/5;
    change = change - (nickels*5);
    printf("%d quarters, %d dimes, %d nickels, %d pennies\n", quarters, dimes, nickels, change);
    return 0;
}


