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


 [HttpGet] [Route ("api/TokenCancellationApi/BeginLengthyOperation/{seconds}")] public string BeginLengthyOperation (int seconds) {
    lock (_lock)
    {
        if (null != cTokenSource) {
            return "A long running is already underway.";
        }
        cTokenSource = new CancellationTokenSource ();
    } try {
        ExecuteEnduranceTask (cTokenSource.Token, seconds);
    }
    catch (OperationCanceledException) {
        return "The running process has been cancelled";
    }
    catch (Exception ex) {
        _lastError = ex.Message;
        return ex.Message;
    }
    finally {
        Destroy (null);
    }
    return "Long running process has completed!";
}
