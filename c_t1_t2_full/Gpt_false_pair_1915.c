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
    struct g 
    {
        char C;
        char G;
        char Q;
        float z[10];
    };
    struct g new_struct;
    new_struct.C = 'D';
    new_struct.G = 'E';
    new_struct.Q = 'F';
    for (i = 0; i < 10; i++)
        new_struct.z[i] = i * 3.15;
    printf("%c,%c,%c", new_struct.C , new_struct.G , new_struct.Q);
    for (i = 0; i < 10; i++)
        printf(",%.8f", new_struct.z[i]);
    return 0;
}
