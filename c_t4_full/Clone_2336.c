int main (void) {
    int inputArr [999];
    int c = 0;
    int length = 0;
    int gotdigit = 0;
    while ((c = getchar ()) != '\n' && c != EOF) {
        if (isdigit (c) && !gotdigit) {
            inputArr[length] = c - '0';
            length++;
            if (length >= 999) {
                break;
            }
            gotdigit = 1;
        }
        else {
            if (c == ' ') {
                gotdigit = 0;
            }
            else {
                printf ("Wrong Input Format!\n");
            }
        }
    }
    return 0;
}





#include <stdio.h>
#include <ctype.h>

int main() {
    int num[999], character = 0, range = 0, isDigit = 0;
    while ((character = getchar()) != '\n' && character != EOF) {
        if (isdigit(character) && !isDigit) {
            num[range++] = character - '0';
            isDigit = 1;
            if (range >= 999) {
                break;
            }
        }
        else if (character == ' ') {
            isDigit = 0;
        }
        else {
            printf("Incorrect Input!\n");
        }
    }
    return 0;
}


