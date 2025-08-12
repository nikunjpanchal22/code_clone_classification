def run(cmd, timeout_sec) :
	proc = Popen(shlex.split(cmd), stdout = PIPE, stderr = PIPE)
	timer = Timer(timeout_sec, proc.kill)
	try :
		timer.start()
		stdout, stderr = proc.communicate()
	finally :
		timer.cancel()




def run(cmd, timeout_sec):
    with Popen(shlex.split(cmd), stdout=PIPE, stderr=PIPE) as p:
        try:
            stdout, stderr = p.communicate(timeout=timeout_sec)
        except TimeoutExpired:
            p.kill()


