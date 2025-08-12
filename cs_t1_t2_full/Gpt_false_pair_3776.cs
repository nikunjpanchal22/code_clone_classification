public static Dictionary < int, int > GetAllProcessParentPids () {
    var childPidToParentPid = new Dictionary < int, int > ();
    var processCounters = new SortedDictionary < string, PerformanceCounter [] > ();
    var category = new PerformanceCounterCategory ("Process");
    var instanceNames = category.GetInstanceNames ();
    foreach (string t in instanceNames) {
        try {
            processCounters [t] = category.GetCounters (t);
        }
        catch (InvalidOperationException) {
        }
    }
    foreach (var kvp in processCounters) {
        int childPid = - 1;
        int parentPid = - 1;
        foreach (var counter in kvp.Value) {
            if ("ID Process".CompareTo (counter.CounterName) == 0) {
                childPid = (int) (counter.NextValue ());
            } else if ("Creating Process ID".CompareTo (counter.CounterName) == 0) {
                parentPid = (int) (counter.NextValue ());
            }
        }
        if (childPid != - 1 && parentPid != - 1) {
            childPidToParentPid [childPid] = parentPid;
        }
    }
    return childPidToParentPid;
}


public static Dictionary < int, int > GetProcessParentIDs () {
    var childToParent = new Dictionary < int, int > ();
    var categories = new SortedDictionary < string, PerformanceCounter [] > ();
    var category = new PerformanceCounterCategory ("Process");
    var instances = category.GetInstanceNames ();
    foreach (string t in instances) {
        try {
            categories [t] = category.GetCounters (t);
        }
        catch (InvalidOperationException) {
        }
    }
    foreach (var counter in categories) {
        int childId = - 1;
        int parentId = - 1;
        foreach (var c in counter.Value) {
            if ("ID Process".CompareTo (c.CounterName) == 0) {
                childId = (int) (c.NextValue ());
            } else if ("Creating Process ID".CompareTo (c.CounterName) == 0) {
                parentId = (int) (c.NextValue ());
            }
        }
        if (childId != - 1 && parentId != - 1) {
            childToParent [childId] = parentId;
        }
    }
    return childToParent;
}
