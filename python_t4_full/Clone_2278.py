def __op__(self, op, args) :
	try :
		other = args [0]
	except IndexError :
		other = None
	print ("%s %s %s" % (self, op, other))
	self, other = coerce(self, other)
	return getattr(self, op)(* args)


  def __op__(self, op, args):
	method = getattr(self, op)
	if len(args) < 1:
		other = None
	else:
		try:
			other = args[0]
		except IndexError:
			other = None
	print("{} {} {}".format(self, op, other))
	self, other = coerce(self, other)
	return method(*args)


