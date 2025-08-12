int main (void) {
    int arr [] = {0, 6, 88, 54};
    char buffer [1000] = {0};
    for (size_t i = 0; i < sizeof arr / sizeof *arr; ++i)
        sprintf (buffer, "%s%d", buffer, arr[i]);
    int val = strtol (buffer, NULL, 10);
    printf ("%d\n", val);
    return 0;
}






#include <stdio.h>
#include <stdlib.h>
int main (void) {
    int arr [] = {0, 6, 88, 54};
    char buffer [1000] = {0};
    for (size_t i = 0; i < sizeof arr / sizeof *arr; ++i) {
        strcat(buffer, itoa(arr[i]));
    }
    int val = atoi(buffer);
    puts(buffer);
    return 0;
}


