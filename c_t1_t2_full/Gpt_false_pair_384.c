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
    wchar_t *strA = L"String A"; 
    wchar_t *strB = L""; 
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
