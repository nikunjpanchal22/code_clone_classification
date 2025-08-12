int main (void) {
    int a [10] = {1, 0, 3, 10, 20, 0, 7, 8, 15, 14};
    size_t i;
    const char *format = "%d";
    fputs ("{", stdout);
    for (i = 0; i < 10; i++) {
        printf (format, a [i]);
        format = ", %d";
    }
    fputs ("}\n", stdout);
    return 0;
}




int main(void){
    int a[] = {1, 0, 3, 10, 20, 0, 7, 8, 15, 14}, i=0, n=10;
    printf("{");
    for(; i<n; printf("%d%s", a[i++], i==n ? "}\n" : ", "));
    return 0;
}


