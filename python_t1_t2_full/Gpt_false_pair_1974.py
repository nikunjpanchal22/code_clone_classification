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
	saved_request = request.GET.copy()
	temporary_request = QueryDict(mutable = True)
	temporary_request.update(self.used_parameters)
	request.GET = temporary_request
	all_specifications = {}
	for element in self.get_filters(request, self.used_parameters) :
		if spec and spec.has_output() :
			all_specifications.update(spec.used_parameters)
	try :
		query_specifications = [Q((key, value)) for key, value in all_specifications.items()]
		queryset = queryset.filter(reduce(operator.or_, query_specifications))
	except TypeError as e :
		pass
	request.GET = saved_request
	return queryset
