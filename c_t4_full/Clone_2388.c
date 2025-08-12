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





struct doStuffRet {
	int arr[2];
};

struct doStuffRet doStuff(int a, int b) {
	struct doStuffRet obj;
	obj.arr[0] = a * a;
	obj.arr[1] = b * b;
	return obj;
} 


