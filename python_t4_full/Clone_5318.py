def timeout(func, args = (), kwargs = {}, timeout_duration = 1, default = None) :
	import signal
	class TimeoutError(Exception) :
		pass




def timeout(func, args = (), kwargs = {}, timeout_duration = 1, default = None) :
	import signal
	class TimeOutError(Exception) : pass
	def handler(signum, frame) : raise TimeOutError()
	signal.signal(signal.SIGALRM, handler) 
	signal.alarm(timeout_duration)
	try:
		result = func(*args, **kwargs)
	except TimeOutError:
		result = default
	finally:
		signal.alarm(0)
	return result


