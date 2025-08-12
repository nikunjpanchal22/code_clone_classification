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


 int main (int argc, char *argv []) {
    assert (argc > 1);
    char *text = argv[1];
    int len = strlen (text);
    int is_Palindrome = 0;
    int i, j;
    for (i = 0, j = len - 1; i < len / 2 && j >= 0; i++, j--) {
        if (text[i] != text[j]) {
            is_Palindrome = 0;
            break;
        }
        else {
            is_Palindrome = 1;
        }
    }
    printf ("%s a palindrome.\n", is_Palindrome ? "is" : "isn't");
    return (0);
}


