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
    char *num, *p;
    num=malloc(100*sizeof(char));
    if(!num)
        return 1;
    memset(num,'0',100-1);
    p=num;
    strncpy(num,"123056",6);
    *(p+3)='4';
    printf("%s\n",num);
    free (num);
    return 0;
}


