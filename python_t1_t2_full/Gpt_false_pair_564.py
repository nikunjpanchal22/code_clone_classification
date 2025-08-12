def __call__(self, * args, ** kwargs) :
	obj = type.__call__(self)
	obj.__init__(*args, **kwargs)
	return obj


 def __call__(self, * args, ** kwargs) :
        instantiate = type.__call__(self)
        instantiate.__init__(*args, **kwargs)
        return instantiate
