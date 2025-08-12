int main () {
    ofstream outdata;
    int i;
    int array [5] = {4, 3, 6, 7, 12};
    outdata.open ("example.dat");
    if (!outdata) {
        cerr << "Error: file could not be opened" << endl;
        exit (1);
    }
    for (i = 0; i < 5; ++i)
        outdata << array[i] << endl;
    outdata.close ();
    return 0;
}


 int main()
{
    ofstream file;
    int x;
    int list[5] = {4, 3, 6, 7, 12};
    file.open("example.dat");
    if (!file) {
        cerr << "Error: file could not be opened" << endl;
        exit(1);
    }
    for (x = 0; x < 5; x++) {
        file << list[x] << endl;
    }
    file.close();
    return 0;
}
