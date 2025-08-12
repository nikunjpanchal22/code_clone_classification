main () {
    int i;
    struct course *c;
    c = malloc (sizeof (struct course));
    c->num_nodes = 3;
    c->nodes = malloc (sizeof (struct node) * c->num_nodes);
    for (i = 0; i < c->num_nodes; i++)
        c->nodes[i] = malloc (sizeof (struct node));
    for (i = 0; i < c->num_nodes; i++)
        free (c->nodes[i]);
    free (c -> nodes);
    free (c);
}





main () {
    struct course *c;
    c = malloc(sizeof(struct course));
    c->num_nodes = 3;
    c->nodes = malloc(c->num_nodes * sizeof(struct node));
    int j = 0;
    while(j < c->num_nodes){
        c->nodes[j] = malloc(sizeof(struct node));
        j++;
    }
    int i = 0;
    while(i < c->num_nodes){
        free(c->nodes[i]);
        i++;
    }
    free(c->nodes);
    free(c);
}


