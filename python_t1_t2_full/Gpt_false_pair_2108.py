def todict(obj) :
	data = {}
	for key, value in obj.__dict__.iteritems() :
		try :
			data [key] = todict(value)
		except AttributeError :
			data [key] = value
	return data


  def todict(obj): 
      data = dict()
      for c, d in obj.__dict__.items():
          try:
              data[c] = todict(d)
          except AttributeError:
              data[c] = d
      return data
