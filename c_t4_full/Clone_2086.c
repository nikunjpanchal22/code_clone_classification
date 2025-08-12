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
    struct course *c = (struct course*) malloc(sizeof (struct course));
    c->num_nodes = 3;
    c->nodes = (struct node**) malloc(c->num_nodes * sizeof(struct node*));
    for (int i = 0; i < c->num_nodes; i++)
        *(c->nodes + i) = (struct node*) malloc(sizeof(struct node));
    for (int i = 0; i < c->num_nodes; i++)
        free(*(c->nodes + i));
    free(c->nodes);
    free(c);
}


