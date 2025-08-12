def convertType(value) :
	try :
		return int(value) if value.strip().isdigit() else float(value)
	except :
		return value


 def convertType(value):
    if value.strip().replace('.', '', 1).isdigit():
        try:
            return int(value)
        except ValueError:
            return float(value)
    else:
        return value  


