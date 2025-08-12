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





int main (void) {
    char strA[] = "Hello World";
    char strB[50];
    int i;
    for(i = 0; strA[i]; i++) 
        strB[i] = strA[i];
    strB[i] = '\0';
    puts (strB);
    return 0;
}


