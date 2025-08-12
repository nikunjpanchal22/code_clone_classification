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
	if key != None :
		return self.pop(key, default)
	popped_item = self.popitem()


