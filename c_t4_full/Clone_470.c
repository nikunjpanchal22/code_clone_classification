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
    int a = 20, b = 20; 
    int temp[2];
    temp = doStuff(a,b);
    a = temp[1];
    b = temp[0];
    printf("%d %d\n", a, b);
    return 0;
}


