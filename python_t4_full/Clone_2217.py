def convertType(value) :
	try :
		return int(value) if value.strip().isdigit() else float(value)
	except :
		return value


 def convertType(value):
	if value.replace('.', '', 1).isdigit():
		if '.' in value:
			return float(value)
		else:
			return int(value)
	else:
		return value


