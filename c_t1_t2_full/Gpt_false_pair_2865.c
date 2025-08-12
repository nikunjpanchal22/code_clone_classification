int main () {
    int i, j, length;
    char space = ' ';
    char phrase [80];
    printf ("Give me the phrase: ");
    gets (phrase);
    length = strlen (phrase);
    for (i = 0, j = length - 1; i < j; i++, j--) {
        while (phrase[i] == space)
            i++;
        while (phrase[j] == space)
            j--;
        if (phrase[i] != phrase[j]) {
            printf ("It's not a palindrome\n");
            return 0;
        }
    }
    printf ("It's a palindrome\n");
    return 0;
}


int main () {
    int i, j, length;
    char space = ' ';
    char phrase [80];
    printf ("Give me the phrase: ");
    gets (phrase);
    length = strlen (phrase);
    for (i = 0, j = length - 1; i < j; i++, j--) {
        while (phrase[i] == space)
            i++;
        while (phrase[j] == space)
            j--;
        if (phrase[i] != phrase[j]) {
            printf ("No, it's not a palindrome\n");
            return 0;
        }
    }
    printf ("Yup, it's a palindrome\n");
    return 0;
}
