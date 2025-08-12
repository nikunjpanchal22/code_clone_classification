def handleError(func) :
	errors = []
	try : 
		func()
	except Exception as e :
		errors.append(str(e))


 def handleError(function):
    exceptions = []
    try:
        function()
    except Exception as e:
        exceptions.append(e.args)
