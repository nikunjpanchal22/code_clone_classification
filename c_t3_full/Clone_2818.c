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
    char st[4];
    int rv;
    
    printf("Enter the number to reverse:\n");
    scanf("%3d", &rv);
    
    if(rv>999) return 0;

    sprintf(st, "%d", rv);
    st[0] = st[0] ^ st[2];
    st[2] = st[0] ^ st[2];
    st[0] = st[0] ^ st[2];
    rv = atoi(st);
    printf("The reverse is %d", rv);

    return 0;
}


