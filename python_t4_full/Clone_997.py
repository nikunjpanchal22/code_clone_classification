def __init__(self, year = None, month = None,day = None, weekday = None,hour = None, minute = None,second = None) :
	loc = locals()
	loc.pop("self")
	self.at = dict((k, v) for k, v in loc.iteritems() if v ! = None)


 def __init__(self, year = None, month = None, day = None, weekday = None, hour = None, minute = None,second = None):
	at_dict = dict()
	for k, v in locals().items():
		if v is not None:
			at_dict[k] = v
	self.at = at_dict


