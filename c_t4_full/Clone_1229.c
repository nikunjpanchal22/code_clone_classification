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




#define SIZE 10
int main(void){
    int a[SIZE] = {1, 0, 3, 10, 20, 0, 7, 8, 15, 14};
    printf("{");
    for(int i=0;i<SIZE;i++){
        printf(i!=SIZE-1?"%d, ":"%d}\n",a[i]);
    }
    return 0;
}


