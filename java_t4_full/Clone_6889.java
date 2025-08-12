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



protected Node getTrueParent () {
    return getEdges () != null && ! getEdges ().isEmpty () ? 
    getEdges().stream().filter(edge -> edge != null && edge.getNode2() == this && ! edge.isPseudo()).findFirst().orElse(null) : null;
}


