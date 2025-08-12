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
    printf("The song list contains %d items\n", newCount); 
    for(int counter = 0; counter < newCount; counter++) 
    { 
        printf("Title: %s\n", SongList[counter].title); 
        printf("Artist: %s\n", SongList[counter].artist); 
        printf("Released in: %s\n", SongList[counter].year); 
    } 
} 


