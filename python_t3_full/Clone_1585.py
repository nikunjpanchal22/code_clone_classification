def run(cmd, timeout_sec):
    proc = Popen(shlex.split(cmd), stdout=PIPE, stderr=PIPE)
    timer = Timer(timeout_sec, proc.kill)
    try:
        timer.start()
        stdout, stderr = proc.communicate()
    finally:
        timer.cancel()


def run(cmd, timeout_sec):
    proc = os.popen(shlex.split(cmd))
    timer = Timer(timeout_sec, proc.kill)
    try:
        timer.start()
        stdout = proc.read()
        stderr = proc.read()
    finally:
        timer.cancel()




