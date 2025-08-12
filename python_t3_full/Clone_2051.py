def __init__(self, maxlen, items = None) :
	self._maxlen = maxlen
	self.d = OrderedDict()
	if items :
		for k, v in items :
			self [k] = v


def __init__(self, maxlen, items = None):
    self._maxlen = maxlen
    self.d = OrderedDict()
    if items and isinstance(items, (list, dict)):
        for k, v in items.items() if isinstance(items, dict) else items:
            self[k] = v



