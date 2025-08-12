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

void reverse(char* ch) {
    int start = 0;
    int end = strlen(ch) - 1;
    while(start < end)
    {
        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;
        start++;
        end--;
    }
    printf("Reversed String: %s\n", ch);
    }

int main() {
    char ch[100];
    scanf("%s", ch);
    reverse(ch);
    return 0;
}


