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


        response[key] = str(value)
    return response



def create_response(self, request, data, response_class=HttpResponse, **response_kwargs):
    stripped_data = data.get('objects', data)
    format = self.determine_format(request)
    response_content = self.serialize(request, stripped_data, format)
    response = response_class(content=response_content,
                              content_type=build_content_type(format),
                              **response_kwargs)
    response_meta = data.get('meta', {})


