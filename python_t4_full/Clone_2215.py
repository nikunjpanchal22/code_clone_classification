def convertType(value) :
	try :
		return int(value) if value.strip().isdigit() else float(value)
	except :
		return value


 def convertType(value) :
	try :
		if isinstance(int(value), int):
			return int(value)
		elif isinstance(float(value), float):
			return float(value)
		else:
			return value
	except :
		return value


