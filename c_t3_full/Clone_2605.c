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
    c = calloc(1, sizeof(*c));
    c->num_nodes = 3;
    c->nodes = calloc(c->num_nodes, sizeof *c->nodes);
    for (int i = 0; i < c->num_nodes; i++)
        c->nodes[i] = calloc(1, sizeof(*c->nodes[i]));
    for (int i = 0; i < c->num_nodes; i++)
        free (c->nodes[i]);
    free (c -> nodes);
    free (c);
}


