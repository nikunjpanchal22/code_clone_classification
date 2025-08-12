def __init__(self, input, output) :
	try :
		self.input = open(input, 'r')
		self.output = open(output, 'w')
	except BaseException as exc :
		self.__exit___(type(exc), exc, exc.__traceback__)
		raise


 def __init__(self, input, output) :
  try:
    # open the input file
    self.input = open(input, 'r')
    # open the output file
    self.output = open(output, 'w')
  except BaseException as exc:
    self.__exit___(type(exc), exc, exc.__traceback__)
    raise
