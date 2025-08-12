int main () {
    char str1 [MAX], str2 [MAX], str3 [MAX];
    int i, j = 0, count = 0;
    printf ("Input string 1: ");
    gets (str1);
    printf ("\nInput string 2: ");
    gets (str2);
    for (i = 0; str1[i] != '\0'; i++) {
        str3[i] = str1[i];
        count++;
    }
    for (i = count; str2[j] != '\0'; i++) {
        str3[i] = str2[j];
        j++;
    }
    str3[i] = '\0';
    printf ("\nConcatenated string : ");
    puts (str3);
    return 0;
}





#include<stdio.h>
#define MAX 100
int main() {
    char str1[MAX], str2[MAX], str3[2*MAX];
    gets(str1); gets(str2);
    memcpy(str3, str1, strlen(str1));
    memcpy(str3+strlen(str1), str2, strlen(str2)+1);
    puts(str3);
    return 0;
}


