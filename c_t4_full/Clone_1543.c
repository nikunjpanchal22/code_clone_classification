int main () {
    char ch;
    float avg;
    int numWords = 0;
    int numLetters = 0;
    bool prevWasASpace = true;
    printf ("Enter a sentence: ");
    while ((ch = getchar ()) != '\n') {
        if (ch != ' ') {
            prevWasASpace = false;
            numLetters++;
        }
        else if (ch == ' ' && !prevWasASpace) {
            numWords++;
            prevWasASpace = true;
        }
    }
    avg = numLetters / (float) (numWords);
    printf ("Average word lenth: %.1f", avg);
    getch ();
}



#include<stdio.h>
#include<conio.h>
int main () {
    char ch; float avg; int numWords, numLetters;
    numWords = numLetters = 0; bool prevWasASpace = true;
    puts("Enter a sentence: ");
    while ((ch = getc(stdin)) != '\n') {
        switch(ch) {
            case ' ':
                if (!prevWasASpace) { numWords++; }
                prevWasASpace = true;
                break;
            default:
                prevWasASpace = false;
                numLetters++;
        }
    }
    avg = (float) numLetters / numWords;
    printf ("Average word length: %.1f", avg);
    getch();
    return 0;
}


