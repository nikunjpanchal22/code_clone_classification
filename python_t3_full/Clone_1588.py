def run(cmd, timeout_sec) :
	proc = Popen(shlex.split(cmd), stdout = PIPE, stderr = PIPE)
	timer = Timer(timeout_sec, proc.kill)
	try :
		timer.start()
		stdout, stderr = proc.communicate()
	finally :
		timer.cancel()


 def run(cmd, timeout_sec) :
   process = subprocess.Popen(shlex.split(cmd), stdout = PIPE, stderr = PIPE)
   timeout = threading.Timer(timeout_sec, process.kill)
   timeout.start()
   try:
       output, errors = process.communicate()
   finally :
       timeout.cancel()
       process.kill()


