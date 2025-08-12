def __op__(self, op, args) :
	try :
		other = args [0]
	except IndexError :
		other = None
	print "%s %s %s" % (self, op, other)
	self, other = coerce(self, other)
	return getattr(self, op)(* args)



def __op__(self, op, args):
	other = args[0] if args else None
	result = f"{self} {op} {other}" 
	print(result)
	self, other = map(float, (self, other))
	return getattr(self, op)(*args)




