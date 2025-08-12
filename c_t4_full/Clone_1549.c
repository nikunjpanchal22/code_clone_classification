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
#define QUERY "What's your sentence: "
int main () {
    char c; float avg; int numWords = 0, numLetters = 0;
    bool pWasASpace = true;
    printf(QUERY);
    while ((c=getchar()) != '\n') {
        pWasASpace ? (c != ' ') && (numLetters++, pWasASpace = false) : (c == ' ') && (numWords++, pWasASpace = true);
    }
    avg = (float)numLetters/numWords;
    printf ("The average word length: %.1f", avg);
    getch ();
    return 0;
}


