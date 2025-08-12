def run(cmd, timeout_sec) :
	proc = Popen(shlex.split(cmd), stdout = PIPE, stderr = PIPE)
	timer = Timer(timeout_sec, proc.kill)
	try :
		timer.start()
		stdout, stderr = proc.communicate()
	finally :
		timer.cancel()


 def run(cmd, timeout_sec) :
   process = Popen(shlex.split(cmd), stdout=PIPE, stderr=PIPE)
   kill_proc = lambda p: p.kill()
   timer = Timer(timeout_sec, kill_proc, [process])
   try:
       timer.start()
       stdout, stderr = process.communicate()
   finally:
       timer.cancel()
