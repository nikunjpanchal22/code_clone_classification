int main () {
    char string [4];
    int reverse = 0;
    printf ("Enter the number to reverse:\n");
    scanf_s ("%d", & reverse);
    if (reverse > 999)
        return 0;
    sprintf_s (string, "%d", reverse);
    char c1 = string[0];
    string[0] = string[2];
    string[2] = c1;
    reverse = atoi (string);
    printf (" The reverse is %d", reverse);
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
int main() {
    char buffer[4];
    int rev;

    printf("Enter the number to reverse:\n");
    scanf("%3d", &rev);

    if(rev > 999) return 0;

    sprintf(buffer, "%d", rev);
    buffer[0] = buffer[0] + buffer[2] - (buffer[2] = buffer[0]);
    rev = atoi(buffer);
    printf("The reverse is %d", rev);

    return 0;
}


