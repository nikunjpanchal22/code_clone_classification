int main (void) {
    int64_t number = 2001000200030LL;
    char data [24];
    char digit [5] = {0}, *p;
    int len, r;
    len = sprintf (data, "%lld", number);
    p = data;
    r = len % 4;
    if (r) {
        strncpy (digit, p, r);
        printf ("%s\n", digit);
        len -= r;
        p += r;
    }
    while (len != 0) {
        strncpy (digit, p, 4);
        printf ("%s\n", digit);
        len -= 4;
        p += 4;
    }
    return 0;
}




#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
    char buffer[25], temp[5] = {0};
    sprintf(buffer, "%lld", 4004001600320LL);
    char* ptr = buffer;
    int remaining = strlen(buffer) % 4;
    if (remaining) {
        strncpy(temp, ptr, remaining);
        printf("%s\n", temp);
        ptr += remaining;
    }
    for (int i = remaining; i < strlen(buffer); i += 4) {
        strncpy(temp, ptr, 4);
        printf("%s\n", temp);
        ptr += 4;
    }
    return EXIT_SUCCESS;
}


