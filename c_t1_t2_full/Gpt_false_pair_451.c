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
    int songTotal = getFileData(fin, SongList, globalCounter); 
    int count = 0; 

    while(count < songTotal) 
    { 
        printf("Song #%d is: %s, %s, %s\n", count+1, SongList[count].title, SongList[count].artist, SongList[count].year); 
        count++; 
    } 
} 
