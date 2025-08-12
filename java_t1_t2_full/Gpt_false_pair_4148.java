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


protected Node getTrueParent3() {
    if(getEdges() != null && !getEdges().isEmpty()) {
        for(Edge edge : getEdges()) {
            if(edge != null && edge.getNode2() == this && !edge.isPseudo()) {
                return edge.getNode1();
            }
        }
    }
    return null;
}
