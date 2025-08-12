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
    char strA[] = "String A"; 
    char strB[50] = ""; 
    puts (strA);
    pA = strA;
    puts (pA);
    pB = strB;
    putchar ('\n');
    int i = 0;
	while (strA[i] != '\0') {
        strB[i++] = *pA++;
    }
    *pB = '\0';
    puts (strB);
    return 0;
}


