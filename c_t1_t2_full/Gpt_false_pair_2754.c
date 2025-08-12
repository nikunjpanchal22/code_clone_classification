int main () {
    int n = 0, i = 0;
    int numbers [5];
    FILE *f = fopen ("Integers.txt", "r");
    if (f != NULL) {
        for (i = 0; i < (sizeof (numbers) / sizeof (int)); i++) {
            if (fscanf (f, "%d\n", &n) > 0)
                numbers[i] = n;
            else
                break;
        }
        fclose (f);
    }
}


int main () {
    int myNumber = 0, myCounter = 0;
    int myDigits [5];
    FILE *myFile = fopen ("Integers.txt", "r");
    if (myFile != NULL) {
        for (myCounter = 0; myCounter < (sizeof (myDigits) / sizeof (int)); myCounter++) {
            if (fscanf (myFile, "%d\n", &myNumber) > 0)
                myDigits[myCounter] = myNumber;
            else
                break;
        }
        fclose (myFile);
    }
}
