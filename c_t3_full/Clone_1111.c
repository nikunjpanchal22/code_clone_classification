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


 int main(int argc, char *argv[])
{
    assert(argc >1);
    char *text = argv[1];
    int len = strlen(text);
    int isPalindrome = 0;
    int i, j;
    for(i=0, j= len-1; i <= j; i++, j--)
    {
        if(text[i] != text[j])
        {
            isPalindrome = 0;
            break;
        }
        else
        {
            isPalindrome = 1;
        }
    }
    printf("%s a palindrome.\n", isPalindrome ? "is" : "isn't");
    return (0);
}


