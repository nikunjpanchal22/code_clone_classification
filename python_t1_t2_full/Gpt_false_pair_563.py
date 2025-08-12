def __call__(self, * args, ** kwargs) :
	obj = type.__call__(self)
	obj.__init__(*args, **kwargs)
	return obj


 def __call__(self, * args, ** kwargs) :
        new_type = type.__call__(self)
        new_type.__init__(*args, **kwargs)
        return new_type
