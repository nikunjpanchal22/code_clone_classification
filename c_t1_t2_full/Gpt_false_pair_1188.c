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


 int main () 
{
    ofstream outputStream; 
    int var;
    int values[5] = {4, 3, 6, 7, 12};

    outputStream.open("example.dat");
    if(!outputStream.is_open()) 
    {
       cerr << "Error: file could not be opened" << endl;
       exit(1);
    }
    for (var=0;var<5;++var) 
        outputStream << values[var] << endl;
    outputStream.close();
    return 0;
}
