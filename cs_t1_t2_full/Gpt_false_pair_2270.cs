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


 [HttpGet] [Route ("api/TokenCancellationApi/StartLongOperation/{seconds}")] public string StartLongOperation (int seconds) {
    lock (_lock)
    {
        if (null != cTokenSource) {
            return "A long running is already underway.";
        }
        cTokenSource = new CancellationTokenSource ();
    } try {
        CompleteLongTask (cTokenSource.Token, seconds);
    }
    catch (OperationCanceledException) {
        return "The running process has been cancelled";
    }
    catch (Exception ex) {
        _lastError = ex.Message;
        return ex.Message;
    }
    finally {
        Release (null);
    }
    return "Long running process has completed!";
}
