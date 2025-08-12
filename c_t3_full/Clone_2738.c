int main (int argc, char *argv []) {
    assert (argc != 1);
    char *text = argv[1];
    int len = strlen (text);
    int is_palindrome = 1;
    int i, j;
    for (i = 0, j = len - 1; i < len / 2; i++, j--) {
        if (text[i] != text[j]) {
            is_palindrome = 0;
            break;
        }
    }
    printf ("%s a palindrome.\n", is_palindrome ? "is" : "isn't");
    return (0);
}



#include <stdio.h>
#include <assert.h>
#include <string.h>
int main (int argc, char **argv) {
    assert (argc >= 2);
    char *str = argv[1];
    int len = strlen (str);
    int i, j, flag = 1;
    for (i = 0, j = len - 1; i < len / 2; i++, j--) {
        if (str[i] != str[j]) {
            flag = 0;
            break;
        }
    }
    printf ("%s", flag ? "Palindrome" : "Not a palindrome");
    return 0;
}


