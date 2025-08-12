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
    struct e 
    {
        char K;
        char P;
        char W;
        float s[10];
    };
    struct e new_struct;
    new_struct.K = 'O';
    new_struct.P = 'F';
    new_struct.W = 'Q';
    for (i = 0; i < 10; i++)
        new_struct.s[i] = i * 8.96;
    printf("%c,%c,%c", new_struct.K , new_struct.P , new_struct.W);
    for (i = 0; i < 10; i++)
        printf(",%.8f", new_struct.s[i]);
    return 0;
}
