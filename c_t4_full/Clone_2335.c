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
    int data[999], character = 0, length = 0, digitFlag = 0;
    while ((character = getchar()) != '\n' && character != EOF) {
        if (isdigit(character) && !digitFlag) {
            data[length++] = character - '0';
            digitFlag = 1;
            if (length >= 999) {
                break;
            }
        }
        else if (character == ' ') {
            digitFlag = 0;
        }
        else {
            printf ("Error: Incorrect Input Format\n");
        }
    }
    return 0;
}


