public int Compare (Object stringA, Object stringB) {
    string [] valueA = stringA.ToString ().Split ('/');
    string [] valueB = stringB.ToString ().Split ('/');
    if (valueA.Length != 2 || valueB.Length != 2) {
        stringA.ToString ().CompareTo (stringB.ToString ());
    }
    if (valueA [0] == valueB [0]) {
        return int.Parse (valueA [1]).CompareTo (int.Parse (valueB [1]));
    } else {
        return int.Parse (valueA [0]).CompareTo (int.Parse (valueB [0]));
    }
}


 public int Compare (Object stringA, Object stringB) {
    string [] valueA = stringA.ToString ().Split ('/');
    string [] valueB = stringB.ToString ().Split ('/');
    if (valueA.Length != 2 || valueB.Length != 2) {
        return stringA.ToString ().CompareToIgnoreCase (stringB.ToString ());
    }
    int val1 = int.Parse (valueA [0]);
    int val2 = int.Parse (valueB [0]);
    if (val1 == val2) {
        return int.Parse (valueA [1]).CompareTo (int.Parse (valueB [1]));
    } else {
        return val1.CompareTo (val2);
    }
} 


