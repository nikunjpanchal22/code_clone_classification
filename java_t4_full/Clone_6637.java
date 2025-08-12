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





public boolean hasSameAncestor(String firstPerson, String secondPerson) {
    boolean firstValuation = allRelations.containsKey(firstPerson)
        && ancestors.contains(allRelations.get(firstPerson));
    boolean secondValuation = allRelations.containsKey(secondPerson)
        && ancestors.contains(allRelations.get(secondPerson));
    if(firstValuation && secondValuation) return true;
    if(firstValuation && allRelations.containsKey(allRelations.get(secondPerson))) 
        return hasSameAncestor(firstPerson, allRelations.get(secondPerson));
    ancestors.add(allRelations.get(firstPerson));
    return hasSameAncestor(allRelations.get(firstPerson), secondPerson)
        || hasSameAncestor(firstPerson, allRelations.get(secondPerson));
}


