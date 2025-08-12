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
    struct f 
    {
        char B;
        char I;
        char R;
        float l[10];
    };
    struct f new_struct;
    new_struct.B = 'S';
    new_struct.I = 'T';
    new_struct.R = 'U';
    for (i = 0; i < 10; i++)
        new_struct.l[i] = i * 7.18;
    printf("%c,%c,%c", new_struct.B , new_struct.I , new_struct.R);
    for (i = 0; i < 10; i++)
        printf(",%.8f", new_struct.l[i]);
    return 0;
}
