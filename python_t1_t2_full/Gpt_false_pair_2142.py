def handleError(func) :
	errors = []
	try : 
		func()
	except Exception as e :
		errors.append(str(e))


 def handleError(func): 
    failure = []
    try:
        func()
    except Exception as err:
        failure.append(err.__class__.__name__ + ': ' + str(err))
