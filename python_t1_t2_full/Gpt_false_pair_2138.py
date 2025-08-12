def handleError(func) :
	errors = []
	try : 
		func()
	except Exception as e :
		errors.append(str(e))


 def handleError(func):
    err = []
    try:
        func()
    except Exception as e:
        err.append(e.__class__.__name__ + ': ' + str(e)) 
