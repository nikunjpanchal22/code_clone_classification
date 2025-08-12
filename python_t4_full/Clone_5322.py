def timeout(func, args = (), kwargs = {}, timeout_duration = 1, default = None) :
	import signal
	class TimeoutError(Exception) :
		pass


	from joblib import Parallel, delayed
	results = Parallel(n_jobs=1, timeout=timeout_duration)(delayed(func)(*args, **kwargs))
	if results:
		return results[0]
	else:
		return default




def timeout(func, args=(), kwargs={}, timeout_duration=1.0, default=None):
	import queue
	from threading import Thread
	try: q = queue.Queue()
	except ImportError: import Queue as queue

	def inner():
		try: q.put(func(*args, **kwargs))
		except Exception: pass

	t = Thread(target=inner)


