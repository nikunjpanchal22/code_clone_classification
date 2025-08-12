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
    int count = 0; 
    while (count < newCount) 
    { 
        printf("Song #%d:\n", count+1); 
        printf("\tTitle - %s\n\tArtist - %s\n\tReleased in - %s\n", SongList[count].title, SongList[count].artist, SongList[count].year); 
        count++; 
    } 
} 
