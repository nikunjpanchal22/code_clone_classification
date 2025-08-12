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
    int set[5];
    FILE* fp = fopen("Integers.txt", "r");
    int idx = 0;
    while(fscanf(fp, "%d", &set[idx]) != EOF && idx < 5){
        idx++;
    }
    fclose(fp);
}


