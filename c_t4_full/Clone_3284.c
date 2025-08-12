int main (void) {
    char str [41];
    printf ("Enter a string (40 characters maximum): ");
    fflush (stdout);
    if (scanf ("%40s", str) == 1) {
        int i;
        printf ("The even string is:");
        for (i = 0; str[i]; i++) {
            if (i % 2 == 0) {
                str[i / 2] = str[i];
            }
            else {
                putchar (str [i]);
            }
        }
        printf ("\n");
        printf ("The odd string is:%.*s\n ", (i + 1) / 2, str);
    }
    return 0;
}





#include <stdio.h>
int main() {
    char str[41], even[21] = "", odd[21] = "";
    printf("Enter a string (40 characters maximum): ");
    scanf("%40s", str);
    for(int i = 0; str[i]; i++) {
        if(i % 2 == 0)
            even[i/2] = str[i];
        else
            odd[i/2] = str[i];
    }
    printf("The even string is: %s\n", even);
    printf("The odd string is: %s\n", odd);
    return 0;
}


