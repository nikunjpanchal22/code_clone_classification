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

void printZeros(int num) {
            if (num == 0) {
                return;
            } else {
                printf("0");
                printZeros(num - 1);
            }
        }

        int main() {
            int zeroCounter = 0;
            char inputNumber[256];
            printf("Please enter the numerical value:");
            fgets(inputNumber, 256, stdin);
            int j = 0;
            while (inputNumber[j] != '\n') {
                if (inputNumber[j++] == '0')
                    zeroCounter++;
            }
            printf("This value had %d zeros, here they are:", zeroCounter);
            printZeros(zeroCounter);
            printf("\n");
            return 0;
}


