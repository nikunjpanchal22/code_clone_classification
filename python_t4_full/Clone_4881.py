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
        def is_prop(c, attr):
            if attr in c.__dict__:
                return isinstance(c.__dict__[attr], property)
            return any(is_prop(b, attr) for b in c.__bases__)
        if is_prop(self.__class__, a):
            getattr(self.__class__, a).fset(self, v)
            print(f"setting attr {a} using property's fset")
        else:
            super().__setattr__(a, v)


