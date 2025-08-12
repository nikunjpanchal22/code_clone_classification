def __init__(self, key, value = None) :
	self.key = key
	self.value = value
	if not key in Master.existent :
		Master.existent [key] = self




def __init__(self, key, value = None):
	self.key = key
	self.value = value
	if key not in Master.existent.keys():
		Master.existent[key] = self
