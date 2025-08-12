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


 int main() {
    ofstream output; 
    int i; 
    int collection[] = {4, 3, 6, 7, 12}; 
    output.open("example.dat"); 
    if (!output) {
        cerr << "Error: file could not be opened" << endl; 
        exit(1); 
    }
    for (i = 0; i < 5; i++) {
        output << collection[i] << endl; 
    }
    output.close(); 
    return 0; 
}
