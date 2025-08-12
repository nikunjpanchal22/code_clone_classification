def handleError(func) :
	errors = []
	try : 
		func()
	except Exception as e :
		errors.append(str(e))


 def handleError(fn):
  failed_list = []
  try:
    fn()
  except Exception as err:
    failed_list.append(err.__class__.__name__ + ': ' + str(err))
