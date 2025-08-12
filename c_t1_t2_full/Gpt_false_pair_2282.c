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
    priority_queue < string > vArray;
    string line;
    ifstream fileToRead ("d2d.txt");
    while (getline (fileToRead, line)) 
    {
        vArray.push (line);
    }
    fileToRead.close ();
    while( !vArray.empty() ) 
    { 
        cout << " [ " << vArray.top() << " ] \n"; 
        vArray.pop(); 
    }
    cout << "\nPress ANY key to close.\n\n";
    cin.ignore ();
    cin.get ();
    return 0;
}
