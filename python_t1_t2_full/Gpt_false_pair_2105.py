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
      for q, r in obj.__dict__.items():
          try:
              data[q] = todict(r)
          except AttributeError:
              data[q] = r
      return data
