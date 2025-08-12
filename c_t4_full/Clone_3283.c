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
    char str[41];
    printf("Enter a string (40 characters maximum): ");
    fflush(stdout);
    scanf("%40s", str);
    for(int i = 0; str[i]; i += 2)
        printf("%c", str[i]);
    printf("\n");
    for(int i = 1; str[i]; i += 2)
        printf("%c", str[i]);
    printf("\n");
    return 0;
}


