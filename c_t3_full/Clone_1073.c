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


 int main() {
    int n = 0; 
    int numbers[5];
    int index = 0;
    FILE *f = fopen("Integers.txt", "r");
 
    if (f != NULL) {
        while (fscanf(f, "%d\n", &n) > 0 && index < 5) {
            numbers[index] = n;
            index++;
        }
        int numElements = index;
        fclose(f);
    }
}


