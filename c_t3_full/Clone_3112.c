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



#include <stdio.h>

int main () {
    struct a {
        char x, y, z;
        double arr[10];
    } b;

    int index;
    b.x = 'c';
    b.y = 'd';
    b.z = 'e';

    for (index = 0; index < 10; index++)
        b.arr[index] = index * 1.2;

    printf ("%c,%c,%c", b.x, b.y, b.z);

    for (index = 0; index < 10; index++)
        printf (",%.8f", b.arr[index]);

    return 0;
}


