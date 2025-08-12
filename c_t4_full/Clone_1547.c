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
    char ch; float avg;
    int numWords = 0, numLetters = 0;
    bool prevWasASpace = true;
    printf ("Provide a sentence: ");
    while ((ch = (getchar ())) != '\n') {
        prevWasASpace ? (ch != ' ') && (numLetters++, prevWasASpace = false) 
: (ch == ' ') && (numWords++, prevWasASpace = true);
    }
    avg = (float) numLetters / numWords;
    printf ("Average word length: %.1f", avg);
    getch ();
    return 0;
}


