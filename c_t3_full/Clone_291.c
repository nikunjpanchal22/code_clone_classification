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
    char *pA;
    char *pB;
    char *strA = "String A"; 
    char *strB = ""; 
    int i = 0;
    puts (strA);
    pA = strA;
    puts (pA);
    pB = strB;
    putchar ('\n');
	while (strA[i] != '\0') {
        strB[i] = strA[i++];
    }
    *pB = '\0';
    puts (strB);
    return 0;
}


