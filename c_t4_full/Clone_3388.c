int main () {
    struct data ob1;
    struct data *buffer = (struct data *) malloc (sizeof (struct data));
    if (buffer == NULL) {
        printf ("Memory allocation failed\n");
        return;
    }
    ob1.num1 = 1;
    ob1.num2 = 2;
    ob1.num3 = 3;
    ob1.num4 = 4;
    memcpy (buffer, & ob1, sizeof (struct data));
}





#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct data {
            int num1;
            int num2;
            int num3;
            int num4;
        };

        int main() {
            struct data ob1 = {1, 2, 3, 4};
            struct data *buffer = malloc(sizeof(struct data));
            if (!buffer) {
                return -1;
            }
            memcpy(buffer, &ob1, sizeof(ob1));
            return 0;
}


