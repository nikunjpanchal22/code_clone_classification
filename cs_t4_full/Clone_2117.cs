private static string GetHandleTypeToken (IntPtr handle, int processId) {
    IntPtr currentProcess = NativeMethods.GetCurrentProcess ();
    bool remote = (processId != NativeMethods.GetProcessId (currentProcess));
    SafeProcessHandle processHandle = null;
    SafeObjectHandle objectHandle = null;
    try {
        if (remote) {
            processHandle = NativeMethods.OpenProcess (ProcessAccessRights.PROCESS_DUP_HANDLE, true, processId);
            if (NativeMethods.DuplicateHandle (processHandle.DangerousGetHandle (), handle, currentProcess, out objectHandle, 0, false, DuplicateHandleOptions.DUPLICATE_SAME_ACCESS)) {
                handle = objectHandle.DangerousGetHandle ();
            }
        }
        return GetHandleTypeToken (handle);
    }
    finally {
        if (remote) {
            if (processHandle != null) {
                processHandle.Close ();
            }
            if (objectHandle != null) {
                objectHandle.Close ();
            }
        }
    }
}





private static string GetHandleTypeToken(IntPtr handle, int processId)
{
    IntPtr currentProcess = NativeMethods.GetCurrentProcess();
    bool remote = processId != NativeMethods.GetProcessId(currentProcess);
    SafeProcessHandle processHandle = remote ? NativeMethods.OpenProcess(ProcessAccessRights.PROCESS_DUP_HANDLE, true, processId) : null;
    SafeObjectHandle objectHandle;
    try {
        if (remote && processHandle != null) {
            objectHandle = NativeMethods.DuplicateHandle(processHandle.DangerousGetHandle(), handle, currentProcess, 0, false, DuplicateHandleOptions.DUPLICATE_SAME_ACCESS);
            handle = objectHandle != null ? objectHandle.DangerousGetHandle() : handle;
        }
        return GetHandleTypeToken(handle);
    }
    finally {
        if (remote) {
            processHandle?.Close();
            objectHandle?.Close();
        }
    }
}


