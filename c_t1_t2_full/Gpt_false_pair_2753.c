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


int run () {
    int num = 0, i = 0;
    int set [5];
    FILE *f = fopen ("Integers.txt", "r");
    if (f != NULL) {
        for (i = 0; i < (sizeof (set) / sizeof (int)); i++) {
            if (fscanf (f, "%d\n", &num) > 0)
                set[i] = num;
            else
                break;
        }
        fclose (f);
    }
}
