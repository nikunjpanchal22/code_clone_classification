def __init__(self, year = None, month = None,day = None, weekday = None,hour = None, minute = None,second = None) :
	loc = locals()
	loc.pop("self")
	self.at = dict((k, v) for k, v in loc.iteritems() if v ! = None)


 def __init__(self, year = None, month = None,day = None, weekday = None,hour = None, minute = None,second = None) :
	attributes = locals()
	attributes.pop("self")
	self.at = dict([i for i in attributes.items() if i[1] != None])


