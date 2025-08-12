public RegionContext GetContext (string regionCode) {
    RegionContext temp = null;
    RegionContext rc = null;
    try {
        if (! this.contextCache.TryGetValue (regionCode.ToUpper (), out rc)) {
            temp = new RegionContext (regionCode);
            this.contextCache.Add (regionCode.ToUpper (), temp);
            rc = temp;
            temp = null;
        }
        return rc;
    }
    finally {
        if (temp != null) {
            temp.Dispose ();
        }
    }
}


 public RegionContext GetContext (string regionCode) {
    RegionContext temp = null;
    RegionContext rc = null;
    bool containskey = false;
    lock (this.contextCache) {
        containskey = this.contextCache.ContainsKey (regionCode.ToUpper ());
    }

    if (!containskey) {
        temp = new RegionContext (regionCode);
        lock (this.contextCache) {
            if (!this.contextCache.ContainsKey (regionCode.ToUpper ())) {
                this.contextCache.Add (regionCode.ToUpper (), temp);
                rc = temp;
                temp = null;
            }
        }
    }
    else {
        rc = this.contextCache[regionCode.ToUpper ()]; 
    } 
    return rc;
}


