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
float GetFloat(void){
            float num;
            scanf("%f",&num);
            return num;
        }
        int main(void){
        float g=GetFloat();
        int mney=roundf(g*100),qr=mney/25, dm=(mney%25)/10, nk=(mney%10)/5, pnny=(mney%5);
        printf("%d quarters, %d dimes, %d nickels, %d pennies\n",qr,dm,nk,pnny);
        return 0;
}


