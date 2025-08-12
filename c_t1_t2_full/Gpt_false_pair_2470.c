int main () {
    int i;
    struct a {
        char a;
        char b;
        char c;
        float f [10];
    };
    struct a my_struct;
    my_struct.a = 'a';
    my_struct.b = 'b';
    my_struct.c = 'c';
    for (i = 0; i < 10; i++)
        my_struct.f[i] = i * 1.1;
    printf ("%c,%c,%c", my_struct.a, my_struct.b, my_struct.c);
    for (i = 0; i < 10; i++)
        printf (",%.8f", my_struct.f[i]);
    return 0;
}


int main () {
    int count;
    struct myStruct {
        char letter1;
        char letter2;
        char letter3;
        float floatData [10];
    };
    struct myStruct myData;
    myData.letter1 = 'a';
    myData.letter2 = 'b';
    myData.letter3 = 'c';
    for (count = 0; count < 10; count++)
        myData.floatData[count] = count * 1.1;
    printf ("%c,%c,%c", myData.letter1, myData.letter2, myData.letter3);
    for (count = 0; count < 10; count++)
        printf (",%.8f", myData.floatData[count]);
    return 0;
}
