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
    char input;
    float average;
    int wordCount=0, characterCount=0;
    bool prevWasSpace=true;
    printf("Input a line: ");
    while ((input = getchar()) != '\n') {
        (input==' ') ? (!prevWasSpace && (++wordCount, prevWasSpace = true)) : (prevWasSpace=false, ++characterCount);
    }
    average = (float)characterCount/(float)wordCount;
    printf ("Avg. word length: %.1f\n", avg);
    getch();
    return 0;
}


