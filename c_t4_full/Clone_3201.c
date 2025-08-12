int main (void) {
    char array [4] = "123\0";
    int total = 0;
    int index;
    int arraysize = strlen (array);
    for (index = 0; index < arraysize; index++) {
        total = ((total << 3) + (total << 1));
        total += (15 & array[index]);
    }
    printf ("Value is: %d", total);
    return 0;
}



 

#include <stdio.h>
int main (void) {
    char array [4] = {'1', '2', '3', '\0'};
    int total = 0;
    for (int index = 0; array[index]!='\0'; index++) {
        total = total * 10 + array[index]-48;
    }
    printf ("Value is: %d", total);
    return 0;
}


