def default(self, obj) :
	if isinstance(obj, datetime.datetime) :
		return obj.isoformat()
	elif isinstance(obj, datetime.date) :
		return obj.isoformat()
	elif isinstance(obj, datetime.timedelta) :
		return (datetime.datetime.min + obj).time().isoformat()
	else :
		super().default(obj)


 def default(self, obj) :
    if isinstance(obj, (datetime.datetime, datetime.date)):
        return obj.isoformat()
    elif isinstance(obj, datetime.timedelta):
        return (datetime.datetime.min + obj).time().isoformat()
    elif isinstance(obj, tuple):
        return obj
    else:
        super().default(obj)


