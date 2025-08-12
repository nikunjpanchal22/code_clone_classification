def __init__(self, * args, ** kwargs) :
	super(Map, self).__init__(* args, ** kwargs)
	for arg in args :
		if isinstance(arg, dict) :
			for k, v in arg.iteritems() :
				self [k] = v
	if kwargs :
		for k, v in kwargs.iteritems() :
			self [k] = v


 def __init__(self, *number, **words):
    super(Map, self).__init__(*number, **words)

    for value in number:
        if isinstance(value, dict):
            for key, entry in value.items():
                self[key] = entry

    if words:
        for key, entry in words.items():
            self[key] = entry
