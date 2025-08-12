def search(self, st) :
	if self.value == st :
		return True
	for child in self.children :
		if child.search(st) :
			return True
	return False



 

def search(self, st):
	value = self.value == st
	if not value :
		for child in self.children :
			value = child.search(st)
			if value :
				break


