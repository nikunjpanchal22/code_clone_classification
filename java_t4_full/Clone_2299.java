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
    if (ListUtils.isNotEmpty(getEdges()))  {
        List<Edge> edges = getEdges();
        for (int i = 0; i < edges.size(); i++) {
            if (edges.get(i) != null && edges.get(i).getNode2() == this && !edges.get(i).isPseudo()) {
                return edges.get(i).getNode1();
            }
        }
    }
    return null;
}


