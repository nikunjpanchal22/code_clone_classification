def __init__(self, key, value = None) :
	self.key = key
	self.value = value
	if not key in Master.existent :
		Master.existent [key] = self




def __init__(self, id, name = None) :
	self.id = id
	self.name = name
	if not id in Master.existent :
		Master.existent [id] = self
