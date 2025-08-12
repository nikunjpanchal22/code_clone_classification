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
    struct course *c = calloc(1, sizeof *c);
    c->num_nodes = 3;
    c->nodes = calloc(c->num_nodes, sizeof(struct node));
    for(int i = 0; i < c->num_nodes; i++)
        c->nodes[i] = calloc(1, sizeof(struct node));
    while(c->num_nodes--)
        free(c->nodes[c->num_nodes]);
    free(c -> nodes);
    free(c);
}


