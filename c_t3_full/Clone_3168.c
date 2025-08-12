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





#include <stdio.h>
#include <string.h>
#include <ctype.h>

int isDigit(char* str);

int main () {
        char upc [12];
        printf ("Enter the UPC code (11 digits): ");
        scanf ("%11s", upc);
        if (strlen (upc) != 11) {
            printf ("The UPC must be exactly 11 digits long\n");
        }
        else if (!isDigit(upc)) {
            printf ("The UPC must contain only digits\n");
        }
        else {
            // UPC code is fine!
        }
        return 0;
    }

    int isDigit(char* str){
        for(int i = 0; i < strlen(str); i++)
            if(!isdigit((unsigned char)str[i]))
                return 0;
        return 1;
}


