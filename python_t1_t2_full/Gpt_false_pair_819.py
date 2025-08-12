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



 def pop(self, key = None, default = object()) :
	if key is None:
		return self.popitem()
	try:
		value = self[key]
		del self[key]
		return value
	except KeyError:
		if not (default is object()):
			return default
