def timeout(func, args = (), kwargs = {}, timeout_duration = 1, default = None) :
	import signal
	class TimeoutError(Exception) :
		pass


			return t.result
		time.sleep(1)
		sec_passed += 1
	return default




def timeout(func, args = (), kwargs = {}, timeout_duration = 1, default = None):
	import ctypes
	import threading
	lib = ctypes.pythonapi
	class TimeLimitExpired(Exception):
		pass
	def raise_exception(thread):
		lib.PyThreadState_SetAsyncExc(thread.ident, ctypes.py_object(TimeLimitExpired))
	t = threading.Thread(target=func, args=args)


