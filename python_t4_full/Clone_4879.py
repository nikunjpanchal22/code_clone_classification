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
        if isinstance(getattr(self.__class__, a, None), property):
            if getattr(self.__class__, a).fset:
                getattr(self.__class__, a).fset(self, v)
                print(f"setting attr {a} using property's fset")
            else:
                raise AttributeError("can't set attribute")
        else:
            super().__setattr__(a, v)
            print(f"setting attr {a}")



