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





main (){
    int num_nodes = 3;
    struct course *c;
    c = malloc(sizeof *c);
    c->num_nodes = num_nodes;
    c->nodes = malloc(num_nodes * sizeof *c->nodes);
    for(int i = 0; i < num_nodes; i++)
        c->nodes[i] = malloc(sizeof *c->nodes[i]);
    while(num_nodes--)
        free(c->nodes[num_nodes]);
    free(c -> nodes);
    free(c);
}


