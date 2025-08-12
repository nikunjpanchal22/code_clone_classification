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




pp
int main() {
    vector<string> vArray;
    string line;
    ifstream file("d2d.txt");
    while(file >> line) {
        vArray.emplace_back(line);
    }
    for_each(vArray.begin(), vArray.end(), 
             [](const string &s) {cout << " [ " << s << " ] \n";});
    cin.get();
    return 0;
}


