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


int main (void) {
    int c = 20;
    int d = 20;
    struct doStuffRet returnedObject;
    returnedObject = doStuff (c, d);
    c = returnedObject.arr[0];
    d = returnedObject.arr[1];
    printf ("%d %d\n", c, d);
    return 0;
}
