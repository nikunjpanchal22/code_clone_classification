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

    deadline = time.time() + timeout_sec

    while True:
        timeout = deadline - time.time()
        if timeout < 0:
            proc.kill()
            break

        rlist, _, _ = select.select([proc.stdout, proc.stderr], [], [], timeout)

        if proc.stdout in rlist:
            stdout = proc.stdout.read()
        if proc.stderr in rlist:
            stderr = proc.stderr.read()

        if proc.poll() is not None:
            break




