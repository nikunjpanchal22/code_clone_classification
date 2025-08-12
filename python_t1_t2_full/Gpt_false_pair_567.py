def __call__(self, * args, ** kwargs) :
	obj = type.__call__(self)
	obj.__init__(*args, **kwargs)
	return obj


 def __call__(self, * args, ** kwargs) :
        spawned_instance = type.__call__(self)
        spawned_instance.__init__(*args, **kwargs)
        return spawned_instance
