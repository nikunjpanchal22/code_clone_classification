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
	attr_list = object.__getattribute__(self, '__List')
	if key in attr_list :
		for index, value in enumerate(attr_list) :
			if key == value :
				object.__setattr__(self, key, value)
				break
	else :
		raise TypeError("%r has no attributes %r" % (self, key))


