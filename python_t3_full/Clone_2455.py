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
    stripped_data = data.pop('objects', data)
    format = self.determine_format(request)
    serialized = self.serialize(request, stripped_data, format)
    response = response_class(content=serialized,
                              content_type=self.build_content_type(format),
                              **response_kwargs)
    for key, value in data.get('meta', {}).items():
        response[key] = str(value)


