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
    char inputNumber[256];
    printf("Please enter the numerical value:");
    fgets(inputNumber, 256, stdin);
    int j = 0;
    while (inputNumber[j] != '\n') {
        if (inputNumber[j++] == '0')
            zeroCounter++;
    }
    printf("This value had %d zeros, here they are: ", zeroCounter);
    char zeros[256] = {0};
    for(int i = 0; i < zeroCounter; i++) {
        zeros[i] = '0';
    }
    printf("%s\n", zeros);
    return 0;
}


