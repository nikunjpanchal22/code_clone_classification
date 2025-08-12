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
    int numbers[999], receivedChar = 0, arraySize = 0, digit = 0;
    while ((receivedChar = getchar()) != '\n' && receivedChar != EOF) {
        if (isdigit(receivedChar) && !digit) {
            numbers[arraySize++] = receivedChar - '0';
            digit = 1;
            if (arraySize >= 999) {
                break;
            }
        }
        else if (receivedChar == ' ') {
            digit = 0;
        }
        else {
            printf("Incorrect Input!\n");
        }
    }
    return 0;
}


