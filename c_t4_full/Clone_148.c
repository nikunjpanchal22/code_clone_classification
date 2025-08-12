int main () {
    FILE *fin = fopen ("test.txt", "rt");
    int newCount = getFileData (fin, SongList, globalCounter);
    int counter = 0;
    while (counter < newCount) {
        printf ("%s, %s, %s", SongList [counter].title, SongList [counter].artist, SongList [counter].year);
        counter++;
    }
}


 int main() 
{ 
    FILE *fin = fopen("test.txt", "rt"); 
    int newCount = getFileData(fin, SongList, globalCounter); 
    for (int counter = 0; counter < newCount; counter++ ) 
    { 
        printf("Song%d: %s, %s, %s\n", counter + 1, SongList[counter].title, SongList[counter].artist, SongList[counter].year); 
    } 
} 


