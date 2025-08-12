def run(cmd, timeout_sec) :
	proc = Popen(shlex.split(cmd), stdout = PIPE, stderr = PIPE)
	timer = Timer(timeout_sec, proc.kill)
	try :
		timer.start()
		stdout, stderr = proc.communicate()
	finally :
		timer.cancel()


 def run(cmd, timeout_sec) :
    proc = Popen(shlex.split(cmd), stdout = PIPE, stderr = PIPE)
    time_elapsed = 0
    timer = Timer(timeout_sec, proc.terminate)
    timer.start()
    while proc.poll() is None:
        time.sleep(1)
        time_elapsed += 1
        if time_elapsed >= timeout_sec:
            proc.terminate()
    stdout, stderr = proc.communicate()
    timer.cancel()


