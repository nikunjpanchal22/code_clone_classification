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



 

#include <stdio.h>
#include <string.h>
int main() {
    char str[] = "The quick brown fox jumps over my big sphinx of quartz";
    char *p;
    for (p = str; *p != '\0'; p++) 
        if(*p == ' ') *p = '';
    puts(str);
    return 0;
}


