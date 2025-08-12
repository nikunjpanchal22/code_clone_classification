int main () {
    int zeroCounter = 0;
    char inputNumber [256];
    printf ("Please enter the numerical value:");
    fgets (inputNumber, 256, stdin);
    int j;
    for (j = 0; inputNumber[j] != '\n'; j++) {
        if (inputNumber[j] == '0')
            zeroCounter++;
    }
    printf ("this value had %d zeros, here they are:    ", zeroCounter);
    while (zeroCounter != 0) {
        printf ("0");
        zeroCounter--;
    }
    printf ("\n");
    return 0;
}





#include <stdio.h>

int main() {
    int zeroCounter = 0;
    char inputNumber;
    printf("Please enter the numerical value:");
    while ((inputNumber = getchar()) != '\n') {
        if (inputNumber == '0') {
            zeroCounter++;
        }
    }
    printf("This value had %d zeros, here they are:", zeroCounter);
    for(int i=0; i<zeroCounter; i++) {
        printf("0");
    }
    return 0;
}


