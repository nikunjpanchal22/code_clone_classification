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
   if(getEdges() != null && getEdges().size() > 0) {
      for(Edge e : getEdges()) {
        if(e != null && e.getNode2() == this && !e.isPseudo()) {
           return e.getNode1();
        }
      }
   }
   return null;
}
