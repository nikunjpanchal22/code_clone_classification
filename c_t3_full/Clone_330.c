int main () {
    FILE *fin = fopen ("test.txt", "rt");
    int newCount = getFileData (fin, SongList, globalCounter);
    int counter = 0;
    while (counter < newCount) {
        printf ("%s, %s, %s", SongList [counter].title, SongList [counter].artist, SongList [counter].year);
        counter++;
    }
}


 int main () 
{ 
    FILE *fin = fopen ("test.txt", "rt"); 
    int newCount = getFileData (fin, SongList, globalCounter);
    int counter = newCount - 1; 
    while (counter >= 0) { 
        printf ("%s, %s, %s", SongList [counter].title, SongList [counter].artist, SongList [counter].year); 
        counter--; 
    } 

} 


