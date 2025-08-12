def search(self, st) :
	if self.value == st :
		return True
	for child in self.children :
		if child.search(st) :
			return True
	return False


 def search(self, st):
        if self.value == st:
            return True

        result = False
        for child in children:
            result = result or child.search(st)
        return result


