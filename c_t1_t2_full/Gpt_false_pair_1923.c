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
    struct d 
    {
        char U;
        char G;
        char K;
        float q[10];
    };
    struct d new_struct;
    new_struct.U = 'X';
    new_struct.G = 'Y';
    new_struct.K = 'Z';
    for (i = 0; i < 10; i++)
        new_struct.q[i] = i * 4.62;
    printf("%c,%c,%c", new_struct.U , new_struct.G , new_struct.K);
    for (i = 0; i < 10; i++)
        printf(",%.8f", new_struct.q[i]);
    return 0;
}
