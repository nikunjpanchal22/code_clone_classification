int main (void) {
    char *pA;
    char *pB;
    puts (strA);
    pA = strA;
    puts (pA);
    pB = strB;
    putchar ('\n');
    while (*pA != '\0') {
        *pB++ = *pA++;
    }
    *pB = '\0';
    puts (strB);
    return 0;
}





#include <string.h>
int main (void) {
    char strA[] = "Hello World";
    char strB[50];
    strcpy(strB, strA);
    puts (strB);
    return 0;
}


