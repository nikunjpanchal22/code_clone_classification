int main (void) {
    unsigned int index;
    unsigned int size;
    int result;
    fprintf (stderr, "input the desired array size: ");
    while (((result = scanf ("%u", &size)) != 1) && (result != EOF)) {
        fprintf (stderr, "invalid input, try again\n");
        clearstdin ();
    }
    if (result == EOF) {
        fprintf (stderr, "EOF recieved, ending the program\n");
        return -1;
    }
    if (size < SOMELARGESIZE) {
        int array [size];
        for (index = 0; index < size; index++) {
            fprintf (stderr, "input an integer: ");
            if (((result = scanf ("%d", &array[index])) == 1) && (result != EOF))
                fprintf (stdout, "\tarray[%d] = %d\n", index, array[index]);
            else if (result == EOF) {
                fprintf (stderr, "EOF recieved, ending the program\n");
                return -1;
            }
            else {
                fprintf (stderr, "invalid input, try again\n");
                index -= 1;
            }
            clearstdin ();
        }
    }
    else {
        fprintf (stderr, "sorry, you requested a very large array\n");
        return -1;
    }
    return 0;
}


int main (void) {
    unsigned int index;
    unsigned int size;
    int result;
    fprintf (stderr, "input the desired array size: ");
    while (((result = scanf ("%u", &size)) != 1) && (result != EOF)) {
        fprintf (stderr, "invalid input, try again\n");
        clearstdin ();
    }
    if (result == EOF) {
        fprintf (stderr, "EOF recieved, ending the program\n");
        return -1;
    }
    if (size < SOMELARGESIZE) {
        double array [size];
        for (index = 0; index < size; index++) {
            fprintf (stderr, "input a double: ");
            if (((result = scanf ("%lf", &array[index])) == 1) && (result != EOF))
                fprintf (stdout, "\tarray[%d] = %.4lf\n", index, array[index]);
            else if (result == EOF) {
                fprintf (stderr, "EOF recieved, ending the program\n");
                return -1;
            }
            else {
                fprintf (stderr, "invalid input, try again\n");
                index -= 1;
            }
            clearstdin ();
        }
    }
    else {
        fprintf (stderr, "sorry, you requested a very large array\n");
        return -1;
    }
    return 0;
}
