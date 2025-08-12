public boolean hasSameAncestor (String person1, String person2) {
    if (allRelations.containsKey (person1)) {
        if (ancestors.contains (allRelations.get (person1))) {
            if (allRelations.containsKey (person2)) {
                if (ancestors.contains (allRelations.get (person2))) {
                    return true;
                } else if (allRelations.containsKey (allRelations.get (person2))) {
                    return hasSameAncestor (person1, allRelations.get (person2));
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            ancestors.add (allRelations.get (person1));
            if (allRelations.containsKey (allRelations.get (person1))) {
                return hasSameAncestor (allRelations.get (person1), person2);
            } else if (allRelations.containsKey (person2)) {
                return hasSameAncestor (person1, allRelations.get (person2));
            } else {
                return false;
            }
        }
    } else {
        return false;
    }
}



public boolean hasSameAncestor(String p1, String p2) {
    if (allRelations.containsKey(p1) && allRelations.containsKey(p2) && ancestors.contains(allRelations.get(p1)) && ancestors.contains(allRelations.get(p2))) return true;
    if (allRelations.containsKey(p1) && ancestors.contains(allRelations.get(p1))) 
        return hasSameAncestor(p1, allRelations.getOrDefault(p2, ""));
    ancestors.add(allRelations.get(p1));
    if (allRelations.containsKey(allRelations.get(p1))) 
        return hasSameAncestor(allRelations.get(p1), p2);
    return allRelations.containsKey(p2) && hasSameAncestor(p1, allRelations.get(p2));
}


