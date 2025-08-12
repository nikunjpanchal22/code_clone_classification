def pop(self, key = None, default = object()) :
	if key is None :
		return self.popitem()
	try :
		val = self[key]
		del self[key]
		return val
	except KeyError :
		if default is object() :
			raise
		return default



 def pop(self, key = None, default = object()):
	try:
		if key is None:
			popped_item = self.popitem()
			return popped_item
		val = self[key]
		del self[key]
		return val
	except KeyError:
		if default is object():
			raise


