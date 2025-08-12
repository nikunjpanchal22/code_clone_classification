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
      for z, w in obj.__dict__.items():
          try:
              data[z] = todict(w)
          except AttributeError:
              data[z] = w
      return data
