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
    int i = 0;
    int size = sizeof(numbers) / sizeof(int);
    FILE *f = fopen("Integers.txt", "r");

    if (f != NULL) {
        for (i = 0; i < size; i++) {
            if (fscanf(f, "%d\n", &n) > 0) {
                numbers[i] = n;
            }
            else {
                break;
            }
        }
        int numElements = i;
        fclose(f);
    }
}


