def decorator(f) :
	@ wraps(f)
	def wrapped(*args, **kwargs) :
		value = f(*args, **kwargs)
		return value
	return wrapped



 
def decorator(f) :
	@wraps(f)
	def wrapped(*args, **kwargs):
		preexecution_task_1()
		value = f(*args, **kwargs)
		postexecution_task_2(value)


