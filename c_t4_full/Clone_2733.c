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
#include <stdlib.h>
   
int main(int argc, char **argv) {
    FILE *file;
    char line[100];
    int arr[100], i = 0;
    int len;
    
    file = fopen("numbers.txt", "r");
    
    if(file == NULL) {
        return -1;
    }
    
    while(fgets(line, sizeof(line), file)) {
        len = sscanf(line, "%d %d %d %d %d %d", &arr[0], &arr[1], &arr[2], &arr[3], &arr[4], &arr[5]);
        for(i = 0; i < len; i++) {
            fprintf(stderr, "%d ", arr[i]);
        }
    }
    
    fclose(file);

    return 0;
}


