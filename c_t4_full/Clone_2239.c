int main () {
    char ch [100];
    scanf ("%s", & ch);
    int i = 0;
    while (i < strlen (ch) / 2) {
        ch[i] = ch[i] ^ ch[strlen (ch) - i - 1];
        ch[strlen (ch) - i - 1] = ch[i] ^ ch[strlen (ch) - i - 1];
        ch[i] = ch[i] ^ ch[strlen (ch) - i - 1];
        i++;
    }
    printf ("Reversed String: %s\n", ch);
    return 0;
}



 

#include <stdio.h>
#include <string.h>

int main() {
    char ch[100], rev[100] = "";
    gets(ch);
    strcat(rev, ch+strlen(ch)-1);
    for(int i = strlen(ch) - 2; i >= 0; i--) {
        char temp[2] = {ch[i], '\0'};
        strcat(rev, temp);
    }
    printf("Reversed String: %s\n", rev);
    return 0;
}


