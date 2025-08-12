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
    int v, w, size;
    char line[80], spaceChar = ' ';
    printf ("Phrase now: ");
    gets (line);
    size = strlen (line);
    for (v = 0, w = size - 1; v < w; v++, w--) {
        while (line[v] == spaceChar) v++;
        while (line[w] == spaceChar) w--;
        if (line[v] != line[w]) {printf ("Not a palindrome\n"); exit(0);}
    }
    printf ("Palindrome!\n");
}


