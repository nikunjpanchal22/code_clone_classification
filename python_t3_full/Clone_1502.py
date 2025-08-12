def __op__(self, op, args) :
	try :
		other = args [0]
	except IndexError :
		other = None
	print ("%s %s %s" % (self, op, other))
	self, other = coerce(self, other)
	return getattr(self, op)(* args)


  def __op__(self, op, args):
	len_args = len(args)
	if len_args > 0:
		other = args[0]
	else:
		other = None

	print(f"{self} {op} {other}")
	self, other = coerce(self, other)
	return getattr(self, op)(*args)


