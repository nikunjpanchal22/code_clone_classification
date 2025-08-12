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
#define START_SENTENCE printf ("Enter a statement: ")
int main () {
    char ch; float avg; int numWords, numLetters;
    numWords = numLetters = 0; bool prevWasASpace = true;
    START_SENTENCE;
    while ((ch = getchar ()) != '\n') {
        if (!(prevWasASpace = (ch == ' '))) { numLetters++; }
        else if ((ch == ' ') && !prevWasASpace) { numWords++; }        
    }
    avg = numLetters / (float)numWords;
    printf ("Avg. word length: %.1f", avg);
    getch ();
    return 0;
}


