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
      for x, y in obj.__dict__.items():
          try:
              data[x] = todict(y)
          except AttributeError:
              data[x] = y
      return data
