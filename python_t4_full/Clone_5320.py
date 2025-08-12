def timeout(func, args = (), kwargs = {}, timeout_duration = 1, default = None) :
	import signal
	class TimeoutError(Exception) :
		pass





def timeout(func, args=(), kwargs={}, timeout_duration=1, default=None):
	import time
	from multiprocessing import Process, Queue
	queue = Queue()
	def target():
		queue.put(func(*args, **kwargs))
	p = Process(target=target)
	p.start()
	p.join(timeout_duration)


