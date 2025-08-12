def __init__(self, * args, ** kwargs) :
	super(Map, self).__init__(* args, ** kwargs)
	for arg in args :
		if isinstance(arg, dict) :
			for k, v in arg.iteritems() :
				self [k] = v
	if kwargs :
		for k, v in kwargs.iteritems() :
			self [k] = v


 def __init__(self, *al, **Kw):
    super(Map, self).__init__(*al, **Kw)
    for ar in al:
        if isinstance(ar, dict):
            for ke, va in ar.items():
                self[ke] = va
    if Kw:
        for ke, va in Kw.items():
            self[ke] = va
