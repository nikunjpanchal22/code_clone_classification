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
int main (int argc, char *argv[]) {
    assert(argc > 1);
    char *s = argv[1];
    int len = strlen(s);
    int is_palin = 1;
    for(int left = 0, right = len - 1; left < len / 2; left++, right--) {
        if(s[left] != s[right]) {
            is_palin = 0;
            break;
        }
    }
    printf("%s a palindrome.\n", is_palin ? "is" : "isn't");
    return 0;
}


