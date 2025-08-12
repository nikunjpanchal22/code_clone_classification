int main (void) {
    int value;
    int count;
    value = 0;
    count = 0;
    if ((scanf ("%d%n", &value, &count) == 1) && (count == 7))
        fprintf (stderr, "ok, value is `%d'\n", value);
    else
        fprintf (stderr, "wrong length: %d\n", count);
    return 0;
}




#include <stdio.h>

int main(void) {
    char buffer[10];
    int value = 0;
    fgets(buffer, 10, stdin);
    int count = sscanf(buffer, "%d", &value);
    if (count == 1 && strlen(buffer) - 1 == 7)
        fprintf(stderr, "ok, value is `%d'\n", value);
    else
        fprintf(stderr, "wrong length: %d\n", strlen(buffer) -1);
    return 0;
}


