def search(self, st) :
	if self.value == st :
		return True
	for child in self.children :
		if child.search(st) :
			return True
	return False


 

def search(self, st):
	if self.value == st : 
		return True
	else :
		value = False
		for child in self.children :
			value = value or child.search(st)
		return value


