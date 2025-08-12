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
    char *str = "This is a simple string made with simple code";
    char new_str[256];
    int i = 0, j = 0, k;
    while(str[i]) {
        if(strstr(&str[i], "simple") == &str[i]) {
            strcpy(&new_str[j], "sample");
            i += 6;
            j += 6;
        }
        else
            new_str[j++] = str[i++];
    }
    new_str[j] = '\0';
    puts(new_str);
    return 0;
}


