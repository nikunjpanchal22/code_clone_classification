def queryset(self, request, queryset) :
	origin_GET = request.GET.copy()
	fake_GET = QueryDict(mutable = True)
	fake_GET.update(self.used_parameters)
	request.GET = fake_GET
	all_params = {}
	for spec in self.get_filters(request, self.used_parameters) :
		if spec and spec.has_output() :
			all_params.update(spec.used_parameters)
	try :
		query_params = [Q((key, value)) for key, value in all_params.items()]
		queryset = queryset.filter(reduce(operator.or_, query_params))
	except TypeError as e :
		pass
	request.GET = origin_GET
	return queryset


  def queryset(self, request, queryset) :
	original_query_information = request.GET.copy()
	modifiable_query_information = QueryDict(mutable = True)
	modifiable_query_information.update(self.used_parameters)
	request.GET = modifiable_query_information
	all_details = {}
	for specification in self.get_filters(request, self.used_parameters) :
		if spec and spec.has_output() :
			all_details.update(spec.used_parameters)
	try :
		query_details = [Q((key, value)) for key, value in all_details.items()]
		queryset = queryset.filter(reduce(operator.or_, query_details))
	except TypeError as e :
		pass
	request.GET = original_query_information
	return queryset
