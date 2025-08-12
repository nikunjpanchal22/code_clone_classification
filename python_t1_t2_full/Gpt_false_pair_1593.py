def get_or_415(self, ident) :
	model_class_name = ''
	try :
		model_class_name = self._mapper_zero().class_.__name__
	except Exception as e :
		print (e)
	rv = self.get(ident)
	if rv is None :
		error_message = json.dumps({'message' : model_class_name + ' ' + str(ident) + ' not found'})
		abort(Response(error_message, 415))
	return rv



  def get_or_415(self, ident):
	model_class_name = ''
	try:
  		model_class_name = self._mapper_zero().class_.__name__
	except Exception as err:
  		print(err)
	rv = self.get(ident)
	if rv == None:
  		error_message = json.dumps({'message': model_class_name + ' ' + str(ident) + ' cannot be found'})
  		abort(Response(error_message, 415))
