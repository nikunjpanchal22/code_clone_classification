int main () {
    FILE *fin = fopen ("test.txt", "rt");
    int newCount = getFileData (fin, SongList, globalCounter);
    int counter = 0;
    while (counter < newCount) {
        printf ("%s, %s, %s", SongList [counter].title, SongList [counter].artist, SongList [counter].year);
        counter++;
    }
}


int main () {
    FILE *fin = fopen ("test.txt", "rt");
    int newCounter = fetchFileData (fin, AlbumList, globalCounter);
    int index = 0;
    while (index < newCounter) {
        printf ("%s, %s, %s", AlbumList [index].title, AlbumList [index].artist, AlbumList [index].year);
        index++;
    }
}
