int main () {
    char str1 [100] = "The quick brown fox jumps over ";
    char str2 [100] = "my big sphinx of quartz";
    int i = 0;
    int j = 0;
    while (str1[i] != '\0') {
        if (str1[i] != ' ')
            str1[j++] = str1[i];
        i++;
    }
    i = 0;
    while (str2[i] != '\0') {
        if (str2[i] != ' ' && j + 1 < sizeof (str1))
            str1[j++] = str2[i];
        i++;
    }
    str1[j] = '\0';
    printf ("'%s'\n", str1);
    return 0;
}



 

#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main() {
    char *s1 = "The quick brown fox jumps over ";
    char *s2 = "my big sphinx of quartz";
    char *str = malloc(strlen(s1) + strlen(s2) + 1);
    int i = 0, j = 0;
    while(s1[i])
        if (s1[i] != ' ') 
            str[j++] = s1[i++];
        else i++;
    i = 0;
    while(s2[i])
        if (s2[i] != ' && j + 1 < sizeof (str1)') 
            str[j++] = s2[i++];
        else i++;
    str[j] = '\0';
    printf("%s\n",str);
    free(str);
    return 0;
}


