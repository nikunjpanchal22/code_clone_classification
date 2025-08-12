int main (void) {
    int a = 20;
    int b = 20;
    struct doStuffRet returnedObject;
    returnedObject = doStuff (a, b);
    a = returnedObject.arr[0];
    b = returnedObject.arr[1];
    printf ("%d %d\n", a, b);
    return 0;
}


 int main () {
    int a, b;
    a = b = 20;
    int* arr;
    arr = doStuff(a, b);
    a = arr[1];
    b = arr[0];
    printf("The values are %d %d\n", a, b);
    return 0;
}


