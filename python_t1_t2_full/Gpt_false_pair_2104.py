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
      for m, n in obj.__dict__.items():
          try:
              data[m] = todict(n)
          except AttributeError:
              data[m] = n
      return data
