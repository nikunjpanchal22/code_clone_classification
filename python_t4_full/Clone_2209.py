def convertType(value) :
	try :
		return int(value) if value.strip().isdigit() else float(value)
	except :
		return value


 def convertType(value):
	try:
		value = value.strip()
		if value.isdigit():
			return int(value)
		elif value.find('.') != -1:
			return float(value)
		else:
			return value
	except:
		return value


