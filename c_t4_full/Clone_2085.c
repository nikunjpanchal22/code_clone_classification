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
    struct course *c = malloc(sizeof *c);
    c->num_nodes = 3;
    c->nodes = malloc(c->num_nodes * sizeof *c->nodes);
    int i;
    for (i = c->num_nodes - 1; i >= 0; i--)
        c->nodes[i] = malloc(sizeof *c->nodes[i]);
    while(c->num_nodes)
        free(c->nodes[--c->num_nodes]);
    free(c -> nodes);
    free(c);
}


