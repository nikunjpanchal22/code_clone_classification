int main () {
    size_t N = 26;
    char ch = 'g';
    const char alp [N] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    const char *enc [N] = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25"};
    size_t i = 0;
    while (i < N && ch != alp[i])
        i++;
    if (i != N)
    printf(enc [i]);
    pause ();
    return 0;
}



int main () {
    size_t N = 26;
    char ch = 'g';
    const char alp [N] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    const char *enc [N] = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25"};

    for (int i=N; i>0 ; i--)
    {
        if ( ch == alp[i] ) 
        {
            printf(enc [i]);
            break;
        }
    }
    system("PAUSE");
    return 0;
}


