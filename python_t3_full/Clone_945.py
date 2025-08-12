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
	attrs_list = object.__getattribute__(self, '__List')
	if key in attrs_list :
		for k in attrs_list :
			if key == k :
				object.__setattr__(self, key, value)
				break
	else :
		raise TypeError("%r has no attributes %r" % (self, key))


