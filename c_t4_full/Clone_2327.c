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
    int vals[5];
    FILE* f_obj = fopen("Integers.txt", "r");
    if(f_obj) {
        for(int j = 0; j < 5; j++) {
            fscanf(f_obj, "%d", &(vals[j]));
        }
        fclose(f_obj);
    }
}


