def __call__(self, * args, ** kwargs) :
	obj = type.__call__(self)
	obj.__init__(*args, **kwargs)
	return obj


 def __call__(self, * args, ** kwargs) :
        initiated = type.__call__(self)
        initiated.__init__(*args, **kwargs)
        return initiated
