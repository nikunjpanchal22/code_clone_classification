def __op__(self, op, args) :
	try :
		other = args [0]
	except IndexError :
		other = None
	print "%s %s %s" % (self, op, other)
	self, other = coerce(self, other)
	return getattr(self, op)(* args)





def __op__(self, op, args) :
	other = args[0] if len(args)>0 else None
	print("{} {} {}".format(self, op, other))
	self, other = map(float, (self, other))


