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


		error_detail = json.dumps({'detail' : model_class + ' ' + str(ident) + ' missing'})
		abort(Response(error_detail, 415))
	return response




def pull_or_415(self, label):
	name_class_model = ''
	try:
		name_class_model = self._retrieval_zero().category_.__name__
	except Exception as error_detail:
		print (error_detail)


