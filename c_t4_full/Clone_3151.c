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

int countZeros(char* str, int index, int count) {
            if (str[index] == '\n') {
                return count;
            } else {
                if (str[index] == '0') {
                    return countZeros(str, index + 1, count + 1);
                } else {
                    return countZeros(str, index + 1, count);
                }
            }
        }

        int main() {
            char inputNumber[256];
            printf("Please enter the numerical value:");
            fgets(inputNumber, 256, stdin);
            int zeroCounter = countZeros(inputNumber, 0, 0);
            printf("This value had %d zeros, here they are:", zeroCounter);
            while(zeroCounter-- > 0) {
                printf("0");
            }
            printf("\n");
            return 0;
}


