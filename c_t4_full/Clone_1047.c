int main (void) {
    char *num, *p;
    num = malloc (sizeof (char) * 100);
    if (num == NULL)
        exit (1);
    memset (num, 0, sizeof (char) * 100);
    p = num;
    strncpy (num, "123056", 100 - 1);
    *(p + 3) = '4';
    printf ("%s\n", num);
    free (num);
    return 0;
}





#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(void) {
    char num[100];
    char *p = num;
    strncpy(num,"123056",99);
    num[3] = '4';
    printf("%s\n" ,num);
    return 0;
}


