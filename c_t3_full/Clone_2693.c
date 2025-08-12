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

void main () {
    int numArray[999], digit = 0, arrayLength = 0, newDigit = 0;
    while ((digit = getchar ()) != '\n' && digit != EOF) {
        if (isdigit (digit) && !newDigit) {
            numArray[arrayLength] = digit - '0';
            arrayLength++;
            if (arrayLength >= 999) {
                break;
            }
            newDigit = 1;
        }
        else if (isspace(digit)) {
            newDigit = 0;
        }
        else {
            printf ("Invalid Input Format!\n");
        }
    }
}


