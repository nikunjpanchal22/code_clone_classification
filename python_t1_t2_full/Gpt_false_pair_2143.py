def handleError(func) :
	errors = []
	try : 
		func()
	except Exception as e :
		errors.append(str(e))


 def handleError(func):
    issues = []
    try:
        func()
    except Exception as err:
        issues.append(err)
