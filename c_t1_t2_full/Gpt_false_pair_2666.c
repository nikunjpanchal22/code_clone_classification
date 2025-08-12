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
    FILE *fin  = fopen ("test.txt", "rt");
    int newCount = getFileData (fin, MusicList, globalCounter);
    int counter = 0;
    while (counter < newCount) {
        printf ("%s, %s, %s", MusicList [counter].title, MusicList [counter].artist, MusicList [counter].year);
        counter++;
    }
}
