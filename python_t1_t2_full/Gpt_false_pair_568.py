def __call__(self, * args, ** kwargs) :
	obj = type.__call__(self)
	obj.__init__(*args, **kwargs)
	return obj


 def __call__(self, * args, ** kwargs) :
        instantiation = type.__call__(self)
        instantiation.__init__(*args, **kwargs)
        return instantiation
