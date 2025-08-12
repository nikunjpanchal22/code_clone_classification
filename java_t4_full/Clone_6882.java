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
    if (getEdges()!= null && !getEdges().isEmpty()) {
        Edge edge = getEdges().stream().filter(e -> e != null && e.getNode2().equals(this) && !e.isPseudo()).findFirst().orElse(null);
        if (edge != null) return edge.getNode1();
    }
    return null;
}


