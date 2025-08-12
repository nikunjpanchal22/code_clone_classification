def handleError(func) :
	errors = []
	try : 
		func()
	except Exception as e :
		errors.append(str(e))


 def handleError(function):
    errors = []
    try:
        exec(function) 
    except Exception as e:
        errors.append(str(e))
