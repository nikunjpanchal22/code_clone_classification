def run(cmd, timeout_sec) :
	proc = Popen(shlex.split(cmd), stdout = PIPE, stderr = PIPE)
	timer = Timer(timeout_sec, proc.kill)
	try :
		timer.start()
		stdout, stderr = proc.communicate()
	finally :
		timer.cancel()






def run_exec(cmd, timeout_limit):
    proc = Popen(shlex.split(cmd), stdout = PIPE, stderr = PIPE)
    timer = Timer(timeout_limit, proc.terminate)
    try:
        timer.start()
        stdout, stderr = proc.communicate()


