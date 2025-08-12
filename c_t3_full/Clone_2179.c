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
		Song songList[256];

		int main () {
		  FILE* fin = fopen("test.txt", "r");
		  int counter = 0;
		  while(fscanf(fin, "%s%s%s", songList[counter].title, songList[counter].artist, songList[counter].year) != EOF) {
		    printf("%s, %s, %s", songList[counter].title, songList[counter].artist, songList[counter].year);
		    counter++;
		  }
		  fclose(fin);
}


