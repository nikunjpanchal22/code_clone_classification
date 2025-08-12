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
    char str[4];
    int r;
    
    printf("Enter the number to reverse:\n");
    scanf("%3d", &r);
    
    if(r>999) return 0;

    snprintf(str,4,"%d",r);
    str[0] = (str[0] + str[2]) - (str[2] = str[0]);
    r = atoi(str);
    printf("The reverse is %d", r);

    return 0;
}


