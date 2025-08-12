def find(self, key) :
	if key == self.key :
		return self.data
	if key < self.key and self.left :
		return self.left.find(key)
	if key > self.key and self.right :
		return self.right.find(key)
	raise KeyError("No such thing")


 

def search(self, key):
    if key == self.key :
        return self.cell
    if key < self.key :
        return self.left.search(key) if self.left else None
    if key > self.key :
        return self.right.search(key) if self.right else None
    raise KeyError("No such thing")


