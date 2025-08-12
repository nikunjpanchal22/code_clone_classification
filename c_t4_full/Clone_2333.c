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
    int data[5];
    FILE* file_ptr = fopen("Integers.txt", "r");
    for(int idx = 0; idx < 5; idx++) {
        fscanf(file_ptr, "%d", &data[idx]);
    }
    fclose(file_ptr);
}


