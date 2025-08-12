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
   int edgesSize = getEdges().size();
   if (edgesSize > 0) {
     for (int i = 0; i < edgesSize; i++) {
       Edge edge = getEdges().get(i);
       if (edge != null && edge.getNode2() == this && !edge.isPseudo()) {
         return edge.getNode1();
       }
     }
   }
   return null;
}


