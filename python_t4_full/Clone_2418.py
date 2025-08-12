def run(cmd, timeout_sec):
    proc = Popen(shlex.split(cmd), stdout=PIPE, stderr=PIPE)
    timer = Timer(timeout_sec, proc.kill)
    try:
        timer.start()
        stdout, stderr = proc.communicate()
    finally:
        timer.cancel()


def run(cmd, timeout_sec):
    manager = multiprocessing.Manager()
    event = manager.Event()

    proc = Popen(shlex.split(cmd), stdout=PIPE, stderr=PIPE)

    def kill_proc(event):
        timeout_sec = deadline.time() - time.time()
        if timeout_sec > 0:
            timer = threading.Timer(timeout_sec, proc.kill)
            timer.start()
            event.wait()
            timer.cancel()

    killer = threading.Thread(target=kill_proc, args=(event,))
    killer.start()

    try:
        stdout, stderr = proc.communicate()
    finally:
        event.set()
        killer.join()




