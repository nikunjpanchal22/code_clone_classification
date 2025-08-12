int main () {
    FILE *fin = fopen ("test.txt", "rt");
    int newCount = getFileData (fin, SongList, globalCounter);
    int counter = 0;
    while (counter < newCount) {
        printf ("%s, %s, %s", SongList [counter].title, SongList [counter].artist, SongList [counter].year);
        counter++;
    }
}





typedef struct {
	  char title[256];
	  char artist[256];
	  char year[256];
	} Song;

	int main () {
	  Song* songList = malloc(sizeof(Song) * 100);
	  FILE *fin = fopen("test.txt", "rt");
	  int newCount = getFileData (fin, songList, 100);
	  
	  for (int counter = 0; counter < newCount; counter++) {
	    printf ("%s, %s, %s\n", songList[counter].title, songList[counter].artist, songList[counter].year);
	  }
	  free(songList);
	  fclose(fin);
}


