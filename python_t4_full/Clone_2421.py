def run(cmd, timeout_sec):
    proc = Popen(shlex.split(cmd), stdout=PIPE, stderr=PIPE)
    timer = Timer(timeout_sec, proc.kill)
    try:
        timer.start()
        stdout, stderr = proc.communicate()
    finally:
        timer.cancel()


def run(cmd, timeout_sec):
    signal.signal(signal.SIGALRM, timeout_handler)

    proc = Popen(shlex.split(cmd), stdout=PIPE, stderr=PIPE)
    signal.alarm(timeout_sec)
    try:
        stdout, stderr = proc.communicate()
        signal.alarm(0)
    except Exception:
        proc.kill()
        signal.alarm(0)




