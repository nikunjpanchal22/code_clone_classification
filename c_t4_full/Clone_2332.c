int main () {
    int n = 0, i = 0;
    int numbers [5];
    FILE *f = fopen ("Integers.txt", "r");
    if (f != NULL) {
        for (i = 0; i < (sizeof (numbers) / sizeof (int)); i++) {
            if (fscanf (f, "%d\n", &n) > 0)
                numbers[i] = n;
            else
                break;
        }
        fclose (f);
    }
}





#include <stdio.h>

int main() {
    int arr[5], i;
    FILE* inp = fopen("Integers.txt", "r");
    for(i = 0; i < 5; i++) {
        fscanf(inp, "%d", &arr[i]);
    }
    fclose(inp);
}


