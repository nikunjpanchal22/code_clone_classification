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
#define GET_AVERAGE (float)numLetters/numWords
int main () {
    char ch; float avg;
    int numWords = 0, numLetters = 0;
    bool wasSpace = true;
    printf("Type a string: ");
    while ((ch = getchar()) != '\n') {
        !(wasSpace = (ch == ' ')) ? numLetters++ : !wasSpace && (numWords++);
    }
    avg = GET_AVERAGE;
    printf ("Avg. length of word: %.1f", avg);
    getch ();
    return 0;
}


