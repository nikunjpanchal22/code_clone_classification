def __init__(self, * args, ** kwargs) :
	super(Map, self).__init__(* args, ** kwargs)
	for arg in args :
		if isinstance(arg, dict) :
			for k, v in arg.iteritems() :
				self [k] = v
	if kwargs :
		for k, v in kwargs.iteritems() :
			self [k] = v


 def __init__(self, *nums, **longNums):
	super(Map, self).__init__(*nums, **longNums)
	for num in nums:
		if isinstance(num, dict):
			for key,value in num.items():
				self[key] = value
	if longNums:
		for key, value in longNums.items():
			self[key] = value
