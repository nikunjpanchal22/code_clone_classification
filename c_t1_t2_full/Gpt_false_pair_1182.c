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
    ofstream dataFile; 
    int num;
    int arr[5] = {4, 3, 6, 7, 12};
    dataFile.open("example.dat"); 
    if (!dataFile) {
        cerr << "Error: file could not be opened" << endl; 
        exit(1);
    }
    for (num = 0; num < 5; num++) {
        dataFile << arr[num] << endl;
    }
    dataFile.close(); 
    return 0;
}
