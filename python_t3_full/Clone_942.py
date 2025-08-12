def __setattr__(self, key, value) :
	setIsOK = False
	for item in self.__List :
		if key == item :
			setIsOK = True
	if setIsOK == True :
		object.__setattr__(self, key, value)
	else :
		raise TypeError("%r has no attributes %r" % (self, key))


 def __setattr__(self, key, value) :
	attributes = [x for x in object.__getattribute__(self, '__List')]
	if key in attributes :
		for obj in attributes :
			if obj == key :
				object.__setattr__(self, key, value)
				break
	else :
		raise TypeError("%r has no attributes %r" % (self, key))


