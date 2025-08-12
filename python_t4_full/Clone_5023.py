def run(cmd, timeout_sec) :
	proc = Popen(shlex.split(cmd), stdout = PIPE, stderr = PIPE)
	timer = Timer(timeout_sec, proc.kill)
	try :
		timer.start()
		stdout, stderr = proc.communicate()
	finally :
		timer.cancel()


        procTimer.cancel()




def runShellCommand(cmd, timeout_sec):
	procInstance = subprocess.Popen(cmd.split(), stdout=subprocess.PIPE, stderr=subprocess.PIPE)
	timeoutTimer = threading.Timer(timeout_sec, procInstance.kill)
	try:
		timeoutTimer.start()


