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
      for i, j in obj.__dict__.items():
          try:
              data[i] = todict(j)
          except AttributeError:
              data[i] = j
      return data
