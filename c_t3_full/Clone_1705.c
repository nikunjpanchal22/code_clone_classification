int main () {
    FILE *myFile;
    myFile = fopen ("somenumbers.txt", "r");
    int numberArray [16];
    int i;
    if (myFile == NULL) {
        printf ("Error Reading File\n");
        exit (0);
    }
    for (i = 0; i < 16; i++) {
        fscanf (myFile, "%d,", & numberArray [i]);
    }
    for (i = 0; i < 16; i++) {
        printf ("Number is: %d\n\n", numberArray [i]);
    }
    fclose (myFile);
    return 0;
}


 int main () {
    char filename[32] = "C:/somefiles/somenumbers.txt";
    FILE *myFile;
    myFile = fopen (filename, "r");
    int numberArray [16] = {0};
    int i;
    if (myFile == NULL) {
        printf ("Error Reading File %s\n", filename);
        exit (0);
    }
    for (i = 0; i < 16; i++) {
        fscanf (myFile, "%d,", &numberArray[i]);
        if (numberArray[i] <= 0)
            printf("Number is invalid\n");
    }
    for (i = 0; i < 16; i++) {
        if(numberArray[i] > 0)
            printf("Number is: %d\n\n", numberArray [i]);
    }
    fclose (myFile);
    return 0;
}


