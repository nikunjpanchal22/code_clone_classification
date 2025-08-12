public void Add (Type type) {
    if (! type.IsVisible) {
        return;
    }
    var members = type.GetMembers (BindingFlags.Instance | BindingFlags.Static | BindingFlags.NonPublic | BindingFlags.Public);
    foreach (var member in members) {
        Add (type, member);
    }
}





public void Add (Type type) {
    if (type.IsVisible) {
        ConcurrentBag<MemberInfo> members = new ConcurrentBag<MemberInfo>(type.GetMembers(BindingFlags.Instance | BindingFlags.Static | BindingFlags.NonPublic | BindingFlags.Public));
        Parallel.ForEach(members, member => {
            Add(type, member);
        });
    }
}


