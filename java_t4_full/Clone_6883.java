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
        List<Edge> filteredEdges =   getEdges().stream().filter(e -> e != null && e.getNode2() == this && !e.isPseudo()).collect(Collectors.toList());
        if(!filteredEdges.isEmpty()) return filteredEdges.get(0).getNode1();
    }
    return null;
}


