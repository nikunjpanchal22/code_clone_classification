def convertType(value) :
	try :
		return int(value) if value.strip().isdigit() else float(value)
	except :
		return value


 def convertType(value):
	x = value.strip()
	try:
		if x.isdigit() and '.' not in x:
			return int(x)
		elif x.replace('.', '', 1).isdigit():
			return float(x)
		else:
			return value
	except:
		return value


