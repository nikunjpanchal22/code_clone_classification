def signal_handler(helloProcess, counterProcess, signum, frame) :
	print(multiprocessing.active_children())
	print("helloProcess: ", helloProcess)
	print("counterProcess: ", counterProcess)
	print("current_process: ", multiprocessing.current_process())
	if signum == 17 :
		for signame in [SIGINT, SIGTERM, SIGQUIT, SIGCHLD] :
			signal(signame, SIG_DFL)
		print("helloProcess: ", helloProcess.is_alive())
		if not helloProcess.is_alive() :
			print("Restarting helloProcess")
			helloProcess = HelloWorld()
			helloProcess.start()
		print("counterProcess: ", counterProcess.is_alive())
		if not counterProcess.is_alive() :
			print("Restarting counterProcess")
			counterProcess = Counter()
			counterProcess.start()
		for signame in [SIGINT, SIGTERM, SIGQUIT, SIGCHLD] :
			signal(signame, partial(signal_handler, helloProcess, counterProcess))
	else :
		signal(SIGCHLD, SIG_IGN)
		if helloProcess.is_alive() :
			print("Stopping helloProcess")
			helloProcess.terminate()
		if counterProcess.is_alive() :
			print("Stopping counterProcess")
			counterProcess.terminate()
		sys.exit(0)


  def signal_handler(helloProcess, counterProcess, signum, frame) :
	print(multiprocessing.active_children())
	print("helloProcess: ", helloProcess)
	print("counterProcess: ", counterProcess)
	print("current_process: ", multiprocessing.current_process())
	if signum == 17 :
		for signame in [SIGINT, SIGTERM, SIGQUIT, SIGCHLD] :
			signal(signame, SIG_DFL)
		print("helloProcess: ", helloProcess.is_alive())
		if not helloProcess.is_alive() :
			print("Restarting helloProcess")
			helloProcess = HelloWorld()
			helloProcess.start()
		print("counterProcess: ", counterProcess.is_alive())
		if not counterProcess.is_alive() :
			print("Restarting counterProcess")
			counterProcess = Counter()
			counterProcess.start()
		for signame in [SIGINT, SIGTERM, SIGQUIT, SIGCHLD] :
			signal(signame, partial(signal_handler, helloProcess, counterProcess))
	else :
		signal(SIGCHLD, SIG_IGN)
		if helloProcess.is_alive() :
			print("Stopping helloProcess")
			helloProcess.terminate()
		if counterProcess.is_alive() :
			print("Stopping counterProcess")
			counterProcess.terminate()
		os._exit(0)
		
