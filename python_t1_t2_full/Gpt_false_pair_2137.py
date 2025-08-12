def handleError(func) :
	errors = []
	try : 
		func()
	except Exception as e :
		errors.append(str(e))


 def handleError(fn):
  errs = []
  try:
    fn()
  except Exception as e:
    errs.append(str(e))
