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
    int a[10] = {1, 0, 3, 10, 20, 0, 7, 8, 15, 14};
    printf("{");
    for(int i=0; i<10; ++i)
        printf("%d%s", a[i], i==9 ? "}\n" : ", ");
    return 0;
}


