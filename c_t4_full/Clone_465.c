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
    struct doStuffRet returnedObject;
    returnedObject = doStuff (a, b);
    int temp[2] = {returnedObject.arr[0], returnedObject.arr[1]};
    a = temp[0];
    b = temp[1];
    printf ("The values are %d %d\n", a, b);
    return 0;
}


