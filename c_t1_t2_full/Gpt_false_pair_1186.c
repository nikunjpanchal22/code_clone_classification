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
    ofstream myFile; 
    int q; 
    int intArr[5] = {4, 3, 6, 7, 12};
    myFile.open("example.dat"); 
    if (!myFile) {
        cerr << "Error: file could not be opened" << endl; 
        exit(1);
    }
    for (q = 0; q < 5; q++) {
        myFile << intArr[q] << '\n';
    }
    myFile.close(); 
    return 0;
}
