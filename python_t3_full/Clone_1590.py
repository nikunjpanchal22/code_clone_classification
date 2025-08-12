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
   t = threading.Timer(timeout_sec, process.kill)
   t.daemon = True
   try:
       stdout, stderr = proc.communicate()
   finally:
       t.cancel()


