def __call__(self, new) :
	params = self.immutable_params
	mutable_params = self.mutable_params
 



 def __call__(self, new) :
	   if not new: 
			return (params, mutable_params)
	   else:
			params.update(new)


