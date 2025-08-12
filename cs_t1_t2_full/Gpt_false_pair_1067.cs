public static int IndexPosition (this XElement element) {
    if (element == null) {
        throw new ArgumentNullException ("element");
    }
    if (element.Parent == null) {
        return - 1;
    }
    if (element.Parent.Elements (element.Name).Count () == 1) {
        return - 2;
    }
    int i = 1;
    foreach (var sibling in element.Parent.Elements (element.Name)) {
        if (sibling == element) {
            return i;
        }
        i ++;
    }
    throw new InvalidOperationException ("element has been removed from its parent.");
}


 public static int IndexPosition (this XElement element) {
    if (element == null) {
        throw new ArgumentNullException ("element");
    }
    if (element.Parent == null) {
        return -1;
    }
     
    int index = 0;
    XElement[] elements = element.Parent.Elements(element.Name).ToArray();
    foreach (XElement sibling in elements) {
        if (sibling == element) {
           return index; 
        }
        index++;
    }
    throw new InvalidOperationException ("element has been removed from its parent.");
}
