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


int main(void)
{
    char *pC;
    char *pD;
    puts(strC);
    pC = strC;
    puts(pC);
    pD = strD;
    putchar('\n');
    while (*pC != '\0')
    {
        *pD++ = *pC++;
    }
    *pD = '\0';
    puts(strD);
    return 0;
}
