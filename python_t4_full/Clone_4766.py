def convertType(value) :
	try :
		return int(value) if value.strip().isdigit() else float(value)
	except :
		return value


		return int(value)
	try:
		return float(value)
	except ValueError:
		return value




def convertType(value) :
	try :
		value = value.replace('.', '', 1)


