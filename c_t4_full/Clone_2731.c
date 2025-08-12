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






#include<stdio.h>
#include<ctype.h>

int main() {
   FILE *file;
   char line[100];

   file = fopen("numbers.txt", "r");
   if(file == NULL)
      return -1;
   
   while(fgets(line, sizeof line, file) != NULL) {
      char *start = line;
      int arr[128], count = 0, step;
      
      while(sscanf(start, "%d%n", &arr[count], &step) == 1) {
         start += step;
         count++;
      }

      for(int i = 0; i < count; i++)
         fprintf(stderr, "%d ", arr[i]);
   }
   fclose(file);
   
   return 0;
}


