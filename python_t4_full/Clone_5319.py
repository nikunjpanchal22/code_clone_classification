def timeout(func, args = (), kwargs = {}, timeout_duration = 1, default = None) :
	import signal
	class TimeoutError(Exception) :
		pass






def timeout(func, args=(), kwargs={}, timeout_duration=1, default=None):
	import threading
	class Results:
		def __init__(self):
			self.res = default

	results = Results()
	def wrapper():
		results.res = func(*args, **kwargs)

	t = threading.Thread(target=wrapper)
	t.start()


