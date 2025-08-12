int main (int argc, char **argv) {
    enemy **enemies;
    enemies = (enemy **) malloc (sizeof (enemy *) * 16);
    memset (enemies, 0, sizeof (enemy *) * 16);
    enemies[0] = (enemy *) malloc (sizeof (enemy));
    memset (enemies [0], 0, sizeof (enemy));
    enemies[0]->type = 23;
    printf ("type: %i  x: %i  y: %i\n\n", enemies [0] -> type, enemies [0] -> x, enemies [0] -> y);
    enemies[0]->x = 10;
    enemies[0]->y = 25;
    enemies[0]->type = 7;
    printf ("type: %i  x: %i  y: %i\n\n", enemies [0] -> type, enemies [0] -> x, enemies [0] -> y);
    free (enemies [0]);
    free (enemies);
    return 0;
}


 int main (int argc, char **argv) {
  enemy **enemies = (enemy **) malloc (sizeof (enemy *) * 16);
  memset (enemies, 0, sizeof (enemy *) * 16);
  enemies[0]= malloc (sizeof (enemy)); 
  memset (enemies [0], 0, sizeof (enemy));
  enemies[0]->type = 23;
  printf ("type: %i  x: %i  y: %i\n\n", enemies [0] -> type, enemies [0] -> x, enemies [0] -> y);
  enemies[0]->x = 10;
  enemies[0]->y = 25;
  enemies[0]->type = 7;
  printf ("type: %i  x: %i  y: %i\n\n", enemies [0] -> type, enemies [0] -> x, enemies [0] -> y);
  freeMemory (enemies[0]);
  freeMemory (enemies);
  return 0; 
}
