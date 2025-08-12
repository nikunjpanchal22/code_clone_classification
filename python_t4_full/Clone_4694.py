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


	entry = self.collect(id)
	if entry is None:
		error_data = json.dumps({'data' : entity_name + ' ' + str(id) + ' unavailable'})
		abort(Response(error_data, 415))
	return entry

  


def extract_or_415(self, id):
	item_name = ''
	try:
		item_name = self._init_zero().object_.__name__


