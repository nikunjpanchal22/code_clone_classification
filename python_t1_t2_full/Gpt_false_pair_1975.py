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
	saved_get_data = request.GET.copy()
	revised_get_data = QueryDict(mutable = True)
	revised_get_data.update(self.used_parameters)
	request.GET = revised_get_data
	all_parameters = {}
	for instance in self.get_filters(request, self.used_parameters) :
		if spec and spec.has_output() :
			all_parameters.update(spec.used_parameters)
	try :
		query_elements = [Q((key, value)) for key, value in all_parameters.items()]
		queryset = queryset.filter(reduce(operator.or_, query_elements))
	except TypeError as e :
		pass
	request.GET = saved_get_data
	return queryset
