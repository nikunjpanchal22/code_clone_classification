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
    if(getEdges() != null && !getEdges().isEmpty()) {
         return getEdges().stream().filter(e -> 
      e != null && e.getNode2() == this && 
      !e.isPseudo()).findFirst().map(Edge::getNode1).orElse(null);
     }
    return null;
}


