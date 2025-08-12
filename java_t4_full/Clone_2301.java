protected Node getTrueParent () {
    if (getEdges () != null && ! getEdges ().isEmpty ()) {
        for (Edge e : getEdges ()) {
            if (e != null && e.getNode2 () == this && ! e.isPseudo ()) {
                return e.getNode1 ();
            }
        }
    }
    return null;
}


 protected Node getTrueParent() {
    if (getEdges() != null) { 
        getEdges().stream().filter(edge -> edge != null && edge.getNode2() == this && !edge.isPseudo())
            .findFirst().map(edge -> edge.getNode1());
    }
    return null;
}


