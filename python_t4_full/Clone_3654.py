def find(self, key) :
	if key == self.key :
		return self.data
	if key < self.key and self.left :
		return self.left.find(key)
	if key > self.key and self.right :
		return self.right.find(key)
	raise KeyError("No such thing")


            return self.left.locate(key)
        if key > self.key and self.right:
            return self.right.locate(key)
    raise KeyError("No such thing")




def find_data(self, key):
    if self.key == key:
        return self.data


