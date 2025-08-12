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
    int* returnedObject;
    returnedObject = doStuff (a, b);
    a = returnedObject[0];
    b = returnedObject[1];
    printf ("The values are %d %d\n", a, b);
    return 0;
}


