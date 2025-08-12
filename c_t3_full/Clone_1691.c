int main () {
    char upc [12];
    printf ("Enter the UPC code (11 digits):");
    scanf ("%11s", upc);
    if (strlen (upc) == 11) {
        if (isDigit (upc)) {
        }
        else {
            printf ("The UPC must contain only digits\n");
        }
    }
    else {
        printf ("The UPC must be exactly 11 digits long\n");
    }
    return 0;
}


  int main () {
    char upc[12];

    printf("Please enter the UPC Code (11 digits): ");
    scanf("%11s", upc);

    // Check if UPC length is 11
    if (strlen(upc) == 11) {
        // Check if all characters of the UPC are digits
        bool digitsOnly = true;
        for (int i=0; i<strlen(upc); i++) {
            if (!isdigit(upc[i])) digitsOnly = false;
        }
        if (digitsOnly) {
           // Continue code execution
        } else {
            printf("The UPC must contain only digits\n");
        }
    }
    else {
        printf("The UPC must be 11 digits long\n");
    }
    return 0;
}


