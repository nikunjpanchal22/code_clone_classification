def __setattr__(self, a, v) :
	propobj = getattr(self.__class__, a, None)
	if isinstance(propobj, property) :
		print "setting attr %s using property's fset" % a
		if propobj.fset is None :
			raise AttributeError("can't set attribute")
		propobj.fset(self, v)
	else :
		print "setting attr %s" % a
		super(Test, self).__setattr__(a, v)


 def __setattr__(self, a, v):
        prop = getattr(self.__class__, a, None)
        if isinstance(prop, property):
            if prop.fset:
                prop.fset(self, v)
                print("setting attr %s using property's fset" % a)
                return
        super().__setattr__(a, v)
        print("setting attr %s" % a)



