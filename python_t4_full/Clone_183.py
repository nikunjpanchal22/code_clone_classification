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
    if isinstance(obj, datetime.datetime) or isinstance(obj, datetime.date) :
        return obj.strftime("%Y-%m-%dT%H:%M:%S")
    elif isinstance(obj, datetime.timedelta) :
        return (datetime.datetime.min + obj).time().strftime("%Y-%m-%dT%H:%M:%S")
    else:
        super().default(obj)


