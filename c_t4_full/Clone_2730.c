int main (int argc, char **argv) {
    FILE *file;
    char line [100];
    file = fopen ("numbers.txt", "r");
    if (file == NULL)
        return -1;
    while (fgets (line, sizeof (line), file) != NULL) {
        char *start;
        int array [100];
        int count;
        int value;
        int step;
        count = 0;
        start = line;
        while (sscanf (start, "%d%n", array +count, &step) == 1) {
            start += step;
            count += 1;
        }
        fprintf (stderr, "%d ", array [0]);
        value = 1;
        for (int i = 1; i < count; ++i) {
            value += (array[i] - array[i - 1]) ? 1 : 0;
            fprintf (stderr, "%d ", array [i]);
        }
        fprintf (stderr, " -- %d\n", value);
    }
    fclose (file);
    return 0;
}






#include <stdio.h>

int main (int argc, char **argv) {
        FILE *file;
        char line [256];
        int val[256];

        file = fopen ("numbers.txt", "r");
        if (file == NULL)
            return -1;

        while (fgets (line, sizeof(line), file)) {
            int n = 0, index = 0, ret;
            while (sscanf(line + index, "%d%n", &val[n], &ret) == 1) {
            index += ret;
            n++;
            }
            for(int i = 0; i < n; i++)
            fprintf (stderr, "%d ", val[i]);
        }
        fclose (file);

        return 0;
}


