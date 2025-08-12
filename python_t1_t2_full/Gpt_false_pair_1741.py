def __setattr__(self, a, v) :
	propobj = getattr(self.__class__, a, None)
	if isinstance(propobj, property) :
		print ("setting attr %s using property's fset" % a)
		if propobj.fset is None :
			raise AttributeError("can't set attribute")
		propobj.fset(self, v)
	else :
		print ("setting attr %s" % a)
		super(Test, self).__setattr__(a, v)


 def __setattr__(self, a, v) :
	propobj = getattr(self.__class__, a, None)
	if isinstance(propobj, property) :
		print("Changing attribute %s with property fset" % a)
		if not propobj.fset :
			raise AttributeError("Can't set field")
		propobj.fset(self, v)
	else :
		print("Establishing attribute %s" % a)
		super(Test, self).__setattr__(a, v)
