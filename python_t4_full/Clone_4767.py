def convertType(value) :
	try :
		return int(value) if value.strip().isdigit() else float(value)
	except :
		return value


		return float(value)
	return value




def convertType(value) :
	if value.strip().lstrip('-').isdigit():
		return int(value)


