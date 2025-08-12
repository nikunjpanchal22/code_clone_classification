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





#include <stdio.h>
#include <math.h>
int main(void){
    float money = 0.00f;
    int change = 0;
    printf("Enter change owed? ");
    scanf("%f", &money);
    change = (int) roundf(money * 100);
    int quarters = change / 25;
    change %= 25;
    int dimes = change / 10;
    change %= 10;
    int nickels = change / 5;
    printf ("%d quarters, %d dimes, %d nickels, %d pennies\n", quarters, dimes, nickels, change%5);
    return 0;
}


