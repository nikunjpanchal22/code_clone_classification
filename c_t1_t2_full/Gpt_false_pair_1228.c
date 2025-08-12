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
   int a = 20;
   int b = 20;
   struct doStuffRet returnedObject;
   returnedObject = doStuff (a, b);
   a = returnedObject.arr[1];
   b = returnedObject.arr[0];
   printf ("%d %d\n", a, b);
   return 0;
}
