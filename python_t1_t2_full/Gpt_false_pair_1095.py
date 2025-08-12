def search(self, st) :
	if self.value == st :
		return True
	for child in self.children :
		if child.search(st) :
			return True
	return False


  def search(self, st):
        if st == self.value:
            return True
        for kid in self.children:
            if kid.search(st):
                return True
        return False
