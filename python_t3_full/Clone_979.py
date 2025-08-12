def __init__(self, input, output) :
	try :
		self.input = open(input, 'r')
		self.output = open(output, 'w')
	except BaseException as exc :
		self.__exit___(type(exc), exc, exc.__traceback__)
		raise


 def __init__(self, input, output) :
  try:
    # open up the input file
    fh_in = open(input_file, 'r')
    # open up the output file
    fh_out = open(output_file, 'w')
    # set the class variables
    self.input = fh_in
    self.output = fh_out
  except BaseException as exc:
      # exit with proper exception information
      self.__exit___(type(exc), exc, exc.__traceback__)
      # raise the exception for further processing
      raise


