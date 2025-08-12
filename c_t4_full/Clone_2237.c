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
    gets(ch);
    int n = strlen(ch);
    for(int i = 0; i < n/2; i++) {  
        char temp = ch[i];
        ch[i] = ch[n - i - 1];  
        ch[n - i - 1] = temp;  
    }
    printf("Reversed String: %s\n", ch);
    return 0;
}


