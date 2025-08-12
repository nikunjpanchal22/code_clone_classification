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
    struct c 
    {
        char L;
        char E;
        char A;
        float g[10];
    };
    struct c new_struct;
    new_struct.L = 'G';
    new_struct.E = 'P';
    new_struct.A = 'M';
    for (i = 0; i < 10; i++)
        new_struct.g[i] = i * 0.45;
    printf("%c,%c,%c", new_struct.L , new_struct.E , new_struct.A);
    for (i = 0; i < 10; i++)
        printf(",%.8f", new_struct.g[i]);
    return 0;
}
