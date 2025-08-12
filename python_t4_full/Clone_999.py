def __init__(self, year = None, month = None,day = None, weekday = None,hour = None, minute = None,second = None) :
	loc = locals()
	loc.pop("self")
	self.at = dict((k, v) for k, v in loc.iteritems() if v ! = None)


 def __init__(self, year = None, month = None, day = None, weekday = None, hour = None, minute = None,second = None):
	loc = {}
	for key, value in locals().items():
		if value != None:
			loc[key] = value
	self.at = loc


