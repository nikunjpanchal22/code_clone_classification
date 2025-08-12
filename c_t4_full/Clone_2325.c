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
    int num[5];
    FILE* file = fopen("Integers.txt", "r");
    if(file == NULL) {
        printf("Error opening file!\n");
    }
    for(int i = 0; i < 5; i++) {
        fscanf(file, "%d", &num[i]);
    }
    fclose(file);
}


