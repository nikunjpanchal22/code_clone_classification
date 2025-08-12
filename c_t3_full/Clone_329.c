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
    int indx = 0; 
    while (indx < newCount) 
    { 
        printf("###### Song %d ######\n", indx+1);
        printf("\tTitle: %s\n", SongList[indx].title);
        printf("\tArtist: %s\n", SongList[indx].artist); 
        printf("\tReleased Year: %s\n", SongList[indx].year); 
        indx++; 
    } 
}


