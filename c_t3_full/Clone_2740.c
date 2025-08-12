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
void main(int argc, char *argv[]) {
    assert(argc > 1);
    int l = strlen(argv[1]);
    int palin = 1;
    int a, b;
    for(a = 0, b = l-1; a < l / 2; a++, b--) {
        if (argv[1][a] != argv[1][b]) {
            palin = 0;
            break;
        }
    }   
    printf(argv[1]);
    printf(" is%s a palindrome.", palin?"":" not");
}


