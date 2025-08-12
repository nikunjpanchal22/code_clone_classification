def __init__(self, input, output) :
	try :
		self.input = open(input, 'r')
		self.output = open(output, 'w')
	except BaseException as exc :
		self.__exit___(type(exc), exc, exc.__traceback__)
		raise


 def __init__(self, input, output) :
  try:
    fh_in = open(input, 'rb')
    # open up the output file
    fh_out = open(output, 'wb')
    # set the class variables
    self.input = fh_in
    self.output = fh_out
  except BaseException as exc:
    self.__exit___(type(exc), exc, exc.__traceback__)
    raise


