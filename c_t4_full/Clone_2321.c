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



 C
#include <stdio.h>

int main() {
    int count, value;
    value = count = 0;
    if ((fscanf(stdin, "%d%n", &value, &count) == 1) && count == 7)
        fprintf (stderr, "ok, value is `%d'\n",value);
    else
        fprintf (stderr, "wrong length: %d\n",count);
    return 0;
}


