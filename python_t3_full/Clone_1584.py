def run(cmd, timeout_sec):
    proc = Popen(shlex.split(cmd), stdout=PIPE, stderr=PIPE)
    timer = Timer(timeout_sec, proc.kill)
    try:
        timer.start()
        stdout, stderr = proc.communicate()
    finally:
        timer.cancel()


def run(cmd, timeout_sec):
    proc = Popen(shlex.split(cmd), stdout=PIPE, stderr=PIPE)

    def kill_proc():
        timer = threading.Timer(timeout_sec, proc.kill)
        timer.start()

    killer = threading.Thread(target=kill_proc)
    killer.start()

    try:
        stdout, stderr = proc.communicate()
    finally:
        killer.join()




