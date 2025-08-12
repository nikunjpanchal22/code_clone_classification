def run(cmd, timeout_sec) :
	proc = Popen(shlex.split(cmd), stdout = PIPE, stderr = PIPE)
	timer = Timer(timeout_sec, proc.kill)
	try :
		timer.start()
		stdout, stderr = proc.communicate()
	finally :
		timer.cancel()


  def run(cmd, timeout_sec) :
    process=subprocess.Popen(shlex.split(cmd),stdout=subprocess.PIPE,stderr=subprocess.PIPE)
    timeout=ThreadWithReturnValue( target=process.communicate )
    timeout.start()
    timeout.join( timeout_sec )
    if timeout.is_alive():
        process.kill()
        timeout.join()
    stdout,stderr=timeout.return_value


