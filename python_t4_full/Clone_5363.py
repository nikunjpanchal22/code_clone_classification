def __init__(self, key, value = None) :
	self.key = key
	self.value = value
	if not key in Master.existent :
		Master.existent [key] = self



def __init__(self, key, value=None):
    self.key = key
    self.value = value if value else {}
    Master.existent = Master.existent if key in Master.existent else dict(list(Master.existent.items()) + [(key, self)])




