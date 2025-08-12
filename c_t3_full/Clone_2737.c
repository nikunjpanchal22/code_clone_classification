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
int main(int argc, char *argv[]) 
{
    assert(argc != 1);
    int len, is_palindrome = 1, i, j;
    char *text;
    text = argv[1];
    len = strlen(text);
    for(i = 0, j = len - 1; i < j; i++, j--) 
    {
        if(text[i] != text[j])
        {
            is_palindrome = 0;
            break;
        }
    }
    printf("%s a palindrome.\n", is_palindrome ? "is" : "isn't");
    return 0;
}


