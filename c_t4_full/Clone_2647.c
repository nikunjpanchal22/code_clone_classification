int main (void) {
    float amount = 0;
    int cents = 0;
    int count = 0;
    int amount_left = 0;
    int coin_values [] = {25, 10, 5, 1};
    int i;
    amount = .30;
    cents = (int) round (amount *100);
    printf ("%d", cents);
    amount_left = cents;
    for (i = 0; i < 4; i++) {
        int current_count = count_number_of_coins (amount_left, coin_values[i]);
        amount_left -= current_count * coin_values[i];
        count += current_count;
    }
    printf ("You get %d coins\n", count);
}




#include <stdio.h>
#include <math.h>

int count_number_of_coins(int, int);

int main(void){
            float amount = .30;
            int cents, count = 0, remaining_value, i;
            int coin_values[]{25, 10, 5, 1};

            cents = (int)round(amount * 100);
            printf("%d\n", cents);

            remaining_value = cents;

            for(i = 0; i < 4; i++){
                int current_count = count_number_of_coins(remaining_value, coin_values[i]);
                remaining_value -= current_count * coin_values[i];
                count += current_count;
            }

            printf("You get %d coins\n", count);
            return 0;
        }

        int count_number_of_coins(int leftover, int value){
            return leftover/value;
}


