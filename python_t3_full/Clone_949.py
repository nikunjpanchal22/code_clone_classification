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
	list_of_attributes = list(self.__List)
	for x in list_of_attributes :
		if key == x :
			object.__setattr__(self, key, value)
			break
	else :
		raise TypeError("%r has no attributes %r" % (self, key))


