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
    FILE *fin = fopen ("test_copy.txt", "rt");
    int newTotal = getFileData (fin, RecordAlbums, globalCounter);
    int count = 0;
    while (count < newTotal) {
        printf ("%s, %s, %s", RecordAlbums [count].title, RecordAlbums [count].artist, RecordAlbums [count].year);
        count++;
    }
}
