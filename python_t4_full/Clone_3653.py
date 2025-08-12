def find(self, key) :
	if key == self.key :
		return self.data
	if key < self.key and self.left :
		return self.left.find(key)
	if key > self.key and self.right :
		return self.right.find(key)
	raise KeyError("No such thing")






def query(self, key):
    if self.key == key:
        return self.data
    elif self.key < key and self.right:
        return self.right.query(key)
    elif self.key > key and self.left:
        return self.left.query(key)


