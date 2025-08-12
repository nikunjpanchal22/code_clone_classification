def convertType(value) :
	try :
		return int(value) if value.strip().isdigit() else float(value)
	except :
		return value





import numbers

def convertType(value) :
	if isinstance(value, numbers.Integral):
		return int(value)


