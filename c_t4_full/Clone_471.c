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
    a = temp[0];
    b = temp[1];
    printf("%d %d and %d %d\n", a, b, temp[0], temp[1]);
    return 0;
}


