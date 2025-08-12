def __call__(self, * args, ** kwargs) :
	obj = type.__call__(self)
	obj.__init__(*args, **kwargs)
	return obj


 def __call__(self, * args, ** kwargs) :
        created_instance = type.__call__(self)
        created_instance.__init__(*args, **kwargs)
        return created_instance
