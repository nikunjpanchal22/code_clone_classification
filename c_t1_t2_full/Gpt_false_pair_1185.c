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
    ofstream out; 
    int c; 
    int elementsList[5] = {4, 3, 6, 7, 12};
    out.open("example.dat"); 
    if (out.fail()) {
        cerr << "Error: file could not be opened" << endl;
        exit(1); 
    }
    for (c = 0; c < 5; c++) {
        out << elementsList[c] << endl; 
    }
    out.close(); 
    return 0;
}
