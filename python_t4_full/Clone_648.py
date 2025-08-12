def decorator(f) :
	@ wraps(f)
	def wrapped(*args, **kwargs) :
		value = f(*args, **kwargs)
		return value
	return wrapped


			postexecution_task_1(e,value)
			return None
		postexecution_task_2(value)
		return value
	return wrapped

 
def decorator(f):
	@wraps(f)
	def wrapped(*args, **kwargs):
		print("Checking if conditions are met...")
		if conditionsMet():
			print("Conditions met. Executing function...")


