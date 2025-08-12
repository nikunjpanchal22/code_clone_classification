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

    printf("Please enter the UPC code (11 digits): ");
    scanf("%11s", upc);

    // If the length of the upc is 11
    if (strlen(upc) == 11) {
        // If the UPC code is contained of only digits
        if(isdigit(upc)) {
            // Continue the execution
        } else {
            printf("The UPC must contain only digits\n");
        }
    } else {
        printf("The UPC must be exactly 11 digits long\n");
    }
    return 0;
}
