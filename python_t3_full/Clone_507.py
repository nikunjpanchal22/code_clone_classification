def __init__(self, maxlen, items = None) :
	self._maxlen = maxlen
	self.d = OrderedDict()
	if items :
		for k, v in items :
			self [k] = v


 def __init__(self, maxlen, items = dict()) :
	self._maxlen = maxlen
	self.d = OrderedDict()
	if items :
		for k, v in items.items() :
			self [k] = v


