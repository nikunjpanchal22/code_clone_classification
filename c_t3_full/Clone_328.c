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
    int counter = 0; 
    while (counter < newCount) 
    { 
        printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"); 
        printf("Song title: %s\n", SongList[counter].title); 
        printf("Song artist: %s\n", SongList[counter].artist); 
        printf("Song year: %s\n", SongList[counter].year); 
        counter++; 
    } 
    printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"); 
}


