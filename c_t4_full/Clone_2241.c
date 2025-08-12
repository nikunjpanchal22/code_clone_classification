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
    char ch[100];
    scanf("%s", ch);
    int i = strlen(ch);
    printf("Reversed String: ");
    while (i > 0) {
        printf("%c", ch[--i]);
    }
    return 0;
}


