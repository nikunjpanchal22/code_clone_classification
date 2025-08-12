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
    char arr[4];
    int r;

    printf("Enter the number to reverse:\n");
    scanf("%3d", &r);

    if(r > 999) return 0;

    sprintf(arr, "%d", r);

    arr[0] ^= arr[2];
    arr[2] ^= arr[0];
    arr[0] ^= arr[2];

    r = atoi(arr);
    printf("The reverse is %d", r);

    return 0;
}


