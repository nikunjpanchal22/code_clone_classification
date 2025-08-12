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
    char ch; float avg; int nw, nl;
    nw = nl = 0; bool prvSpace = true;
    printf ("Key in a statement: ");
    while ((ch = getchar()) != '\n') {
        ((!prvSpace) && (ch == ' ')) ? (nw++, prvSpace = true) : (prvSpace = false, nl++);
    }
    avg = (float) nl / nw;
    printf ("Avg. word length: %.1f", avg);
    getch();
    return 0;
}


