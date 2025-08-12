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


	int main()
{
    int i;
    struct b 
    {
        char G;
        char O;
        char S;
        float c[10];
    };
    struct b new_struct;
    new_struct.G = 'N';
    new_struct.O = 'F';
    new_struct.S = 'H';
    for (i = 0; i < 10; i++)
        new_struct.c[i] = i * 2.33;
    printf("%c,%c,%c", new_struct.G , new_struct.O , new_struct.S);
    for (i = 0; i < 10; i++)
        printf(",%.8f", new_struct.c[i]);
    return 0;
}
