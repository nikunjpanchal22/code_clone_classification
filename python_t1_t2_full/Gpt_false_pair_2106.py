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
      for p, q in obj.__dict__.items():
          try:
              data[p] = todict(q)
          except AttributeError:
              data[p] = q
      return data
