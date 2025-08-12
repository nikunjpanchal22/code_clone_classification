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
    char *pE;
    char *pF;
    puts(strE);
    pE = strE;
    puts(pE);
    pF = strF;
    putchar('\n');
    while (*pE != '\0')
    {
        *pF++ = *pE++;
    }
    *pF = '\0';
    puts(strF);
    return 0;
}
