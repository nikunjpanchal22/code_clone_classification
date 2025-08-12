def create_response(self, request, data, response_class = HttpResponse, ** response_kwargs) :
	stripped_data = data.get('objects') or data
	desired_format = self.determine_format(request)
	serialized = self.serialize(request, stripped_data, desired_format)
	response = response_class(content = serialized,
	content_type = build_content_type(desired_format),
	** response_kwargs)
	for name, value in data.get('meta', {}).items() :
		response [name] = str(value)
	return response


 def create_response(self, request, data, response_class=HttpResponse, **response_kwargs):
	stripped_data = data.get('messages') or data
	desired_format = self.determine_format(request)
	serialized = self.serialize(request, stripped_data, desired_format)
	response = response_class(content=serialized,
	content_type=build_content_type(desired_format),
		**response_kwargs)
	for name, value in data.get('parameters', {}).items():
		response[name] = str(value)
	return response
