def run(cmd, timeout_sec):
    proc = Popen(shlex.split(cmd), stdout=PIPE, stderr=PIPE)
    timer = Timer(timeout_sec, proc.kill)
    try:
        timer.start()
        stdout, stderr = proc.communicate()
    finally:
        timer.cancel()


def run(cmd, timeout_sec):
    timer = threading.Timer(timeout_sec, lambda: proc.kill())
    timer.start()

    proc = Popen(shlex.split(cmd), stdout=PIPE, stderr=PIPE)

    try:
        stdout, stderr = proc.communicate()
    finally:
        timer.cancel()




