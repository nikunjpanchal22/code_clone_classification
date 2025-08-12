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
      for a, b in obj.__dict__.items():
          try:
              data[a] = todict(b)
          except AttributeError:
              data[a] = b
      return data
