[HttpGet] [Route ("api/TokenCancellationApi/BeginLongProcess/{seconds}")] public string BeginLongProcess (int seconds) {
    lock (_lock)
    {
        if (null != cTokenSource) {
            return "A long running is already underway.";
        }
        cTokenSource = new CancellationTokenSource ();
    } try {
        LongRunningFunc (cTokenSource.Token, seconds);
    }
    catch (OperationCanceledException) {
        return "The running process has been cancelled";
    }
    catch (Exception ex) {
        _lastError = ex.Message;
        return ex.Message;
    }
    finally {
        Cleanup (null);
    }
    return "Long running process has completed!";
}


 [HttpGet] [Route ("api/TokenCancellationApi/ManageLongFunction/{seconds}")] public string ManageLongFunction (int seconds) {
    lock (_lock)
    {
        if (null != cTokenSource) {
            return "A long running is already underway.";
        }
        cTokenSource = new CancellationTokenSource ();
    } try {
        ExecuteProlongedJob (cTokenSource.Token, seconds);
    }
    catch (OperationCanceledException) {
        return "The running process has been cancelled";
    }
    catch (Exception ex) {
        _lastError = ex.Message;
        return ex.Message;
    }
    finally {
        DisposeResources (null);
    }
    return "Long running process has completed!";
}
