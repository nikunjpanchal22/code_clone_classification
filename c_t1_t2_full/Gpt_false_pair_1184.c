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
    ofstream myData; 
    int p; 
    int numArray[5] = {4, 3, 6, 7, 12};
    myData.open("example.dat"); 
    if (!myData) {
        cerr << "Error: file could not be opened" << endl;
        exit(1); 
    }
    for (p=0; p<5; p++) {
        myData << numArray[p] << endl; 
    }
    myData.close();
    return 0;
}
