def __init__(self, input, output) :
	try :
		self.input = open(input, 'r')
		self.output = open(output, 'w')
	except BaseException as exc :
		self.__exit___(type(exc), exc, exc.__traceback__)
		raise


 def __init__(self, input, output) :
  try:
    f = open(input, 'r')
    self.input = f
    g = open(output, 'w')
    self.output=g
  except BaseException as exc:
    self.__exit___(type(exc), exc, exc.__traceback__)
    raise


