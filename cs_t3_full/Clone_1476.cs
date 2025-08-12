public static void RecycleApplicationPool (string serverName, string appPoolName) {
    if (! string.IsNullOrEmpty (serverName) && ! string.IsNullOrEmpty (appPoolName)) {
        try {
            using (ServerManager manager = ServerManager.OpenRemote (serverName))
            {
                ApplicationPool appPool = manager.ApplicationPools.FirstOrDefault (ap => ap.Name == appPoolName);
                if (appPool != null) {
                    bool appPoolRunning = appPool.State == ObjectState.Started || appPool.State == ObjectState.Starting;
                    bool appPoolStopped = appPool.State == ObjectState.Stopped || appPool.State == ObjectState.Stopping;
                    if (appPoolRunning) {
                        while (appPool.State == ObjectState.Starting) {
                            System.Threading.Thread.Sleep (1000);
                        }
                        if (appPool.State != ObjectState.Stopped) {
                            appPool.Stop ();
                        }
                        appPoolStopped = true;
                    }
                    if (appPoolStopped && appPoolRunning) {
                        while (appPool.State == ObjectState.Stopping) {
                            System.Threading.Thread.Sleep (1000);
                        }
                        appPool.Start ();
                    }
                } else {
                    throw new Exception (string.Format ("An Application Pool does not exist with the name {0}.{1}", serverName, appPoolName));
                }
            }}
        catch (Exception ex) {
            throw new Exception (string.Format ("Unable to restart the application pools for {0}.{1}", serverName, appPoolName), ex.InnerException);
        }
    }
}


  public static void RecycleApplicationPool (string serverName, string appPoolName) {
        if (! string.IsNullOrEmpty (serverName) && ! string.IsNullOrEmpty (appPoolName)) {
            try {
                using (ServerManager manager = ServerManager.OpenRemote (serverName))
                {
                    ApplicationPool appPool = manager.ApplicationPools.FirstOrDefault (ap => ap.Name == appPoolName);
                    if (appPool != null) {
                        if (appPool.State == ObjectState.Started || appPool.State == ObjectState.Starting) {
                            while (appPool.State == ObjectState.Starting) {
                                System.Threading.Thread.Sleep (1000);
                            }
                            if (appPool.State != ObjectState.Stopped) {
                                appPool.Kick ();
                            }
                        }
                        else if (appPool.State == ObjectState.Stopped || appPool.State == ObjectState.Stopping) {
                            appPool.Start ();
                        }
                    }}
                }
            catch (Exception ex) {
                throw new Exception (string.Format ("Unable to restart the application pools for {0}.{1}", serverName, appPoolName), ex.InnerException);
            }
        }
}


