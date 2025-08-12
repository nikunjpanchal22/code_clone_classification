public void Add (Type type) {
    if (! type.IsVisible) {
        return;
    }
    var members = type.GetMembers (BindingFlags.Instance | BindingFlags.Static | BindingFlags.NonPublic | BindingFlags.Public);
    foreach (var member in members) {
        Add (type, member);
    }
}





public void Add(Type type) {
		    if (type.IsVisible) {
			AddMembersFromType(type);
		    }
		}

		private void AddMembersFromType(Type type) {
		    foreach (var member in GetMembers(type)) {
			Add(type, member);
		    }
		}

		private MemberInfo[] GetMembers(Type type) {
		    return type.GetMembers(BindingFlags.Instance | BindingFlags.Static | BindingFlags.NonPublic | BindingFlags.Public);
}


