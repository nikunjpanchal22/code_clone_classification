def run(cmd, timeout_sec):
    proc = Popen(shlex.split(cmd), stdout=PIPE, stderr=PIPE)
    timer = Timer(timeout_sec, proc.kill)
    try:
        timer.start()
        stdout, stderr = proc.communicate()
    finally:
        timer.cancel()


def run(cmd, timeout_sec):
    def kill_proc(proc):
        timer = multiprocessing.Timer(timeout_sec, proc.kill)
        timer.start()

    proc = Popen(shlex.split(cmd), stdout=PIPE, stderr=PIPE)
    killer_proc = multiprocessing.Process(target=kill_proc, args=(proc,))
    killer_proc.start()

    try:
        stdout, stderr = proc.communicate()
    finally:
        killer_proc.join()




