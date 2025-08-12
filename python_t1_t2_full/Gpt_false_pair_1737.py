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
		print("Using propery's fset to modify %s" % a)
		if not propobj.fset :
			raise AttributeError("Can't change this attribute")
		propobj.fset(self, v)
	else :
		print("Assigning attribute %s" % a)
		super(Test, self).__setattr__(a, v)
