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





#include<stdio.h>
#include<string.h>
void main () {
    int beg, end, length;
    char whitespace = ' ', sentence[80];
    printf ("Phrase input: ");
    gets (sentence);
    length = strlen (sentence);
    for (beg = 0, end = length - 1; beg < end; beg++, end--) {
        while (sentence[beg] == whitespace) beg++;
        while (sentence[end] == whitespace) end--;
        if (sentence[beg] != sentence[end]) {printf ("It is not a palindrome\n"); exit(0);}
    }
    printf ("Yes, it is a palindrome\n");
}


