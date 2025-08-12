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


		abort(Response(error_info, 415))
	return data




def request_or_415(self, ident):
	model_class = ''
	try:
		model_class = self._initializer_zero().cname_.__name__
	except Exception as ex:
		print (ex)
	response = self.request(ident)


