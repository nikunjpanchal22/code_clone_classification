int main () {
    int k;
    struct sigdeath_notify_info death;
    daft_thread_accounting_info_init (& g_thread_accounting);
    register_signal_handlers ();
    for (k = 0; k < 200; ++k) {
        start_daft_thread (someone_please_fix_me, (void *) k);
    }
    while (read (g_thread_accounting.monitor_pipe[0], &death, sizeof (death)) == sizeof (death)) {
        struct daft_thread_t *info = find_thread_by_tid (death.tid);
        if (info == NULL) {
            fprintf (stderr, "*** thread_id %u not found\n", death.tid);
            continue;
        }
        fprintf (stderr, "Thread %u (%d) died of %d, restarting.\n", death.tid, (int) info -> start_routine_arg, death.signum);
        restart_daft_thread (info);
    }
    fprintf (stderr, "Shouldn't get here.\n");
    return 0;
}



int main () {
    int k;
    struct sigdeath_notify_info death;
    daft_thread_accounting_info_init (& g_thread_accounting);
    register_signal_handlers ();
    for (k = 0; k < 200; ++k) {
        start_daft_thread (update_fix, (void *) k);
    }
    while (read (g_thread_accounting.monitor_pipe[0], &death, sizeof (death)) == sizeof (death)) {
        struct daft_thread_t *info = find_thread_by_tid (death.tid);
        if (info == NULL) {
            fprintf (stderr, "*** thread_id %u not found\n", death.tid);
            continue;
        }
        fprintf (stderr, "Thread %u (%d) died of %d, restarting.\n", death.tid, (int) info -> start_routine_arg, death.signum);
        restart_daft_thread (info);
    }
    fprintf (stderr, "Shouldn't get here.\n");
    return 0;
}
