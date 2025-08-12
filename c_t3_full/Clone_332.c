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
    for(int counter = newCount-1; counter>=0; counter--) {
        printf("The song is => %s, Artist => %s & released in => %s\n", SongList[counter].title, SongList[counter].artist, SongList[counter].year);
    }
}


