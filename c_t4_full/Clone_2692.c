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
            while(*input++)
                if (*input == ',') 
                    count ++;
            return count;
        }

        void set (struct x *arr, char *input) {
            char *end;
            for (int i = 0; i < n; i++) {
                input = strstr(input, "(") + 1;
                arr[i].a = strtol(input, &end, 10);
                input = strstr(input, ",") + 1;
                arr[i].b = strtol(input, &end, 10);
                input = strstr(input, ")") + 1;
            }
}


