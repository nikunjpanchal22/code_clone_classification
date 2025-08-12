def handleError(func) :
	errors = []
	try : 
		func()
	except Exception as e :
		errors.append(str(e))


 def handleError(funct):
  error_msgs = []
  try:
    funct()
  except Exception as e:
    error_msgs.append(e.__class__.__name__ + ': ' + str(e))
