int main (void) {
    char *input = "((1828,299),(2729,2553),(2797,2929),(2200,1383),(2894,876))";
    int i, n = count (input);
    if (n == 0) {
        printf ("invalid format!\n");
        exit (EXIT_FAILURE);
    }
    struct x arr [n];
    set (arr, input);
    for (i = 0; i < n; ++i) {
        printf ("(%4d, %4d)\n", arr [i].a, arr [i].b);
    }
    return 0;
}





struct x {int a; int b;};

int count (char *input) {
            int count = 0;
            for (int i = 0; input[i]; i++) {
                if (input[i] == ',') 
                    count += 1;
            }
            return count;
        }

        void set (struct x *arr, char *input) {
            int i = 0;
            char *token = strtok(input, "(,)");
            while (token) {
                arr[i/n].a = atoi(token);
                token = strtok(NULL, "(,)");
                arr[i/n].b = atoi(token);
                token = strtok(NULL, "(,)");
                i += 2;
            }
}


