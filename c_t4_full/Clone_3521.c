int main (void) {
    char n [64];
    char m [64];
    char *p = n;
    int i = 0;
    int c;
    scanf ("%63[0-9] %63[0-9]", n, m);
    while ((c = m[i++]) != '\0') {
        int j = c - '0';
        while (j-- > 0)
            if (*p)
                putchar (*p++);
        putchar (' ');
    }
    putchar ('\n');
    return 0;
}





#include<stdio.h>

typedef int m32;

m32 main()
{
    char n[64], m[64];
    char* ptr = n;
    m32 idx = 0, temp;

    scanf("%63[0-9] %63[0-9]", n, m);
    while(((temp = *ptr++) != '\0'))
    {
        m32 j = temp - '0';
        while(j-- > 0)
        {
            if(ptr[idx])
                putchar(*(ptr++));
            putchar(' ');
        }
        putchar('\n');
    }

    return 0;
}


