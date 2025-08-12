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
    if (getEdges() == null || getEdges().isEmpty()) return null;
    Iterator<Edge> edgeIterator = getEdges().iterator();
    while(edgeIterator.hasNext()){
        Edge edge = edgeIterator.next();
        if(edge != null && edge.getNode2() == this && ! edge.isPseudo()){
            return edge.getNode1();
        }
    }
    return null;
}


