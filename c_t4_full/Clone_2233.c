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
    char ch[100], r;
    int begin, end, count = 0;
    scanf("%s", ch);
    while (ch[count] != '\0')
      count++;
    end = count - 1;
    for (begin = 0; begin < count; begin++) {
      r = ch[begin];
      ch[begin] = ch[end];
      ch[end] = r;
      end--;
    }
    printf("Reversed String: %s\n", ch);
    return 0;
}


