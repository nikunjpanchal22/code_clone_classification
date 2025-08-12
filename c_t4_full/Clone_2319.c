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

int main(void) {
    char line[256];
    int value, count;

    fgets(line, sizeof(line), stdin);
    sscanf(line, "%d%n", &value, &count);

    if(count==7) printf("ok,value is `%d'\n",value);
    else printf("wrong length: %d\n",count);

    return 0;
}


