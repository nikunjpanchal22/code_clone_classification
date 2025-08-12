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
      
        for node in self.children:
            flag = node.search(st)
            if flag is True:
                return True
        
        return False


