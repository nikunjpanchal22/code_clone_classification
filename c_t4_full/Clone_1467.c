int main () {
    char str [] = "This is a simple string made with simple code";
    char *pch;
    int i = 0, count = 0;
    for (i = 0; i < strlen (str); i++) {
        if (str[i] == 's' && str[i + 1] == 'i' && str[i + 2] == 'm' && str[i + 3] == 'p' && str[i + 4] == 'l' && str[i + 5] == 'e') {
            count++;
        }
    }
    for (i = 1; i <= count; i++) {
        pch = strstr (str, "simple");
        strncpy (pch, "sample", 6);
    }
    puts (str);
    return 0;
}




#include<string.h>
#include<stdio.h>

int main()
{
    char str[] = "This is a simple string made with simple code";
    int i = 0;
    while ( str[i] != '\0' ) {
        if ( strncmp(&str[i], "simple", 6) == 0 ) {
            strncpy(&str[i], "sample", 6);
        }
        i++;
    }
    puts (str);
    return 0;
}


