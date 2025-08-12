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


 def __setattr__(self, a, v) :
        try:
            propobj = getattr(self.__class__, a, None)
            if propobj:
                if hasattr(propobj, 'fset'):
                    print(f"setting attr {a} using property's fset")
                    propobj.fset(self, v)
                else:
                    print(f"can not set attr {a}")
        finally:
            super().__setattr__(a, v)



