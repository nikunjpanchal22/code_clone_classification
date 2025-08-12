def handleError(func) :
	errors = []
	try : 
		func()
	except Exception as e :
		errors.append(str(e))


 def handleError(function):
    error_arr = []
    try: 
        exec(function)
    except Exception as ex:
        err = 'Error :' + ex.__class__.__name__
        error_arr.append(err) 


