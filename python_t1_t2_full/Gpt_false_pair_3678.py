def __init__(self, key, value = None) :
	self.key = key
	self.value = value
	if not key in Master.existent :
		Master.existent [key] = self




def __init__(self, entry, description = None) :
	self.entry = entry
	self.description = description
	if not entry in Master.existent :
		Master.existent [entry] = self
