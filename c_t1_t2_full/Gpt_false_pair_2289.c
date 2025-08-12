int main () {
    cout << "\nDynamic 2D Array.\n\n";
    vector < string > vArray;
    string line;
    ifstream fileToRead ("d2d.txt");
    while (getline (fileToRead, line)) {
        vArray.push_back (line);
    }
    fileToRead.close ();
    for (int i = 0; i < vArray.size (); i++) {
        cout << " [ " << vArray[i] << " ] \n";
    }
    cout << "\nPress ANY key to close.\n\n";
    cin.ignore ();
    cin.get ();
    return 0;
}


 
int main () {
    cout << "\nDynamic 2D Array.\n\n";
    deque < string > vArray;
    string line;
    ifstream fileToRead ("d2d.txt");
    while (getline (fileToRead, line)) {
        vArray.push_back (line);
    }
    fileToRead.close ();
    for (int i = 0; i < vArray.size (); i++) {
        cout << " [ " << vArray[i] << " ] \n";
    }
    cout << "\nPress ANY key to close.\n\n";
    cin.ignore ();
    cin.get ();
    return 0;
}
