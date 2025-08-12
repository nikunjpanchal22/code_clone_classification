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


public static Dictionary < int, int > GetAllProcessAncestorIds () {
    var offspringIdToAncestorId = new Dictionary < int, int > ();
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
        int offspringId = - 1;
        int ancestorId = - 1;
        foreach (var counter in kvp.Value) {
            if ("ID Process".CompareTo (counter.CounterName) == 0) {
                offspringId = (int) (counter.NextValue ());
            } else if ("Creating Process ID".CompareTo (counter.CounterName) == 0) {
                ancestorId = (int) (counter.NextValue ());
            }
        }
        if (offspringId != - 1 && ancestorId != - 1) {
            offspringIdToAncestorId [offspringId] = ancestorId;
        }
    }
    return offspringIdToAncestorId;
}
