def convertType(value) :
	try :
		return int(value) if value.strip().isdigit() else float(value)
	except :
		return value


 def convertType(value) :
	try :
		if (value.strip()).isnumeric():
			return int(value)
		elif value.strip().replace('.', '', 1).isdigit():
			return float(value)
		else:
			return value
	except :
		return value


