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
#include<string.h>
#define MAX 100
int main() {
    char str1[MAX], str2[MAX], str3[2*MAX];
    scanf("%s",str1);
    scanf("%s",str2);
    strcpy(str3,str1);
    strcat(str3,str2);
    printf("%s",str3);
    return 0;
}


