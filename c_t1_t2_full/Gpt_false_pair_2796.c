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


int main () {
    int zeroCounter = 0;
    char inputNumber [256];
    printf ("Please enter the numerical value:");
    fgets (inputNumber, 256, stdin);
    int k;
    for (k = 0; inputNumber[k] != '\n'; k++) {
        if (inputNumber[k] == '0')
            zeroCounter++;
    }
    printf ("this value had %d zeros, listed below:  ", zeroCounter);
    while (zeroCounter != 0) {
        printf ("0, ");
        zeroCounter--;
    }
    printf ("\n");
    return 0;
}
