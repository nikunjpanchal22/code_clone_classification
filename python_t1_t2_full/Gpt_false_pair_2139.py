def handleError(func) :
	errors = []
	try : 
		func()
	except Exception as e :
		errors.append(str(e))


 def handleError(func):
    errors_list = []
    try:
        func()
    except Exception as e:
        errors_list.append(str(e))
