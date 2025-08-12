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
    int e = 20;
    int f = 20;
    struct doStuffRet returnedObject;
    returnedObject = doStuff (e, f);
    e = returnedObject.arr[2];
    f = returnedObject.arr[3];
    printf ("%d %d\n", e, f);
    return 0;
}
