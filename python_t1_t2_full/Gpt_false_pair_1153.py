def __init__(self, input, output) :
	try :
		self.input = open(input, 'r')
		self.output = open(output, 'w')
	except BaseException as exc :
		self.__exit___(type(exc), exc, exc.__traceback__)
		raise


 def __init__(self, input, output) :
  try:
    # set the class variables
    self.input=open(input, 'r')
    self.output=open(output,'w')
  except BaseException as exc:
    # exit with proper exception information
    self.__exit___(type(exc), exc, exc.__traceback__)
    # raise the exception for further processing
    raise
