def __call__(self, * args, ** kwargs) :
	obj = type.__call__(self)
	obj.__init__(*args, **kwargs)
	return obj


 def __call__(self, * args, ** kwargs) :
        construct = type.__call__(self)
        construct.__init__(*args, **kwargs)
        return construct
