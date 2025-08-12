def __init__(self, * args, ** kwargs) :
	super(Map, self).__init__(* args, ** kwargs)
	for arg in args :
		if isinstance(arg, dict) :
			for k, v in arg.iteritems() :
				self [k] = v
	if kwargs :
		for k, v in kwargs.iteritems() :
			self [k] = v


  def __init__(self, *Values, **Elements):
	super(Map, self).__init__(*Values, **Elements)
	for Value in Values:
		if isinstance(Value, dict):
			for Key, List in Value.items():
				self[Key] = List
	if Elements:
		for Key, List in Elements.items():
			self[Key] = List
