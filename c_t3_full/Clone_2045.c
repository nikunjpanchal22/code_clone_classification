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
    char *num = malloc(100*sizeof(char)), *p;
    if(num == NULL) exit(1);
    memset(num, 0, sizeof(num));
    p=num;
    strcpy(num, "123056");
    p[3] = '4';
    printf("%s\n", p);
    free(num);
    return 0;
}


