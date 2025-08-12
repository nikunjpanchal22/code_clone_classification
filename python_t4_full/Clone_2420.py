def run(cmd, timeout_sec):
    proc = Popen(shlex.split(cmd), stdout=PIPE, stderr=PIPE)
    timer = Timer(timeout_sec, proc.kill)
    try:
        timer.start()
        stdout, stderr = proc.communicate()
    finally:
        timer.cancel()


def run(cmd, timeout_sec):
    timeout_sec = int(timeout_sec)
    proc = Popen(shlex.split(cmd), stdout=PIPE, stderr=PIPE)

    try:
        end_time = time.time() + timeout_sec
        while time.time() < end_time and proc.poll() is None:
            os.waitpid(proc.pid, 0)
        if proc.poll() is None:
            os.kill(proc.pid, signal.SIGKILL)
            os.waitpid(proc.pid, 0)
    finally:
        stdout, stderr = proc.communicate()




