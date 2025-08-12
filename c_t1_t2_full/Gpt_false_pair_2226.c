int main () {
    struct data ob1;
    struct data *buffer = (struct data *) malloc (sizeof (struct data));
    if (buffer == NULL) {
        printf ("Memory allocation failed\n");
        return;
    }
    ob1.num1 = 1;
    ob1.num2 = 2;
    ob1.num3 = 3;
    ob1.num4 = 4;
    memcpy (buffer, & ob1, sizeof (struct data));
}


 int main (){
    struct data ob1;
    size_t bufSize = sizeof(struct data);
    struct data *buffer = (struct data *) aligned_alloc(16, bufSize);
    if (buffer == NULL) {
        printf ("Memory allocation failed\n");
        return;
    }
    ob1.num1 = 1;
    ob1.num2 = 2;
    ob1.num3 = 3;
    ob1.num4 = 4;
    memcpy (buffer, & ob1, bufSize);
}
