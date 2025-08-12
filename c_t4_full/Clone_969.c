int main () {
    int dec_num;
    printf ("type in a 3 digit number to convert to binary\n");
    if (scanf ("%d", &dec_num) != 1) {
        printf ("invalid input\n");
        return 1;
    }
    if (dec_num < 0 || dec_num > 999) {
        printf ("invalid value: must have at most 3 digits\n");
        return 1;
    }
    for (;;) {
        if (dec_num % 2 != 0) {
            printf ("1");
        }
        else {
            printf ("0");
        }
        dec_num = dec_num / 2;
        if (dec_num == 0)
            break;
    }
    printf ("\n");
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int num;
    printf("Enter a three-digit number:\n");
    scanf("%d", &num);
    
    if (num < 0 || num > 999) {
        printf("Invalid input!\n");
        return 1;
    }
    
    char buffer[10];
    _itoa(num, buffer, 2);
    printf("%s\n", buffer);
    return 0;
}


