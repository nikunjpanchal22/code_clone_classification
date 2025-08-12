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
    string upperCode = regionCode.ToUpper();
    bool newContext = false;
    
    lock (this.contextCache) {
        if (!this.contextCache.TryGetValue (upperCode, out rc)) {
            newContext = true;
        }
    }

    if (newContext) {
        temp = new RegionContext (regionCode);
        lock (this.contextCache) {
            if (!this.contextCache.ContainsKey (upperCode)) {
                this.contextCache.Add (upperCode, temp);
            }
        }
        rc = temp;
        temp = null;
    }
    return rc;
}


