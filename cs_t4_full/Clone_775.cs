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
     
    int desiredIndex = -1;
    XElement[] elements = element.Parent.Elements(element.Name).ToArray();
    int i = 0;
    while (i < elements.Length) {
        if (elements[i] == element) {
           desiredIndex = i;
           break; 
        }
        i++;
    }
    if (desiredIndex == -1) {
        throw new InvalidOperationException ("element has been removed from its parent.");
    }
    return desiredIndex;
}


