def todict(obj) :
	data = {}
	for key, value in obj.__dict__.iteritems() :
		try :
			data [key] = todict(value)
		except AttributeError :
			data [key] = value
	return data


 def todict(obj):
      data = {}
      for k, v in obj.__dict__.items():
          try:
              data[k] = todict(v)
          except AttributeError:
              data[k] = v
      return data
