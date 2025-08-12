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
	saved_req = request.GET.copy()
	copy_req = QueryDict(mutable = True)
	copy_req.update(self.used_parameters)
	request.GET = copy_req
	all_conditions = {}
	for descriptor in self.get_filters(request, self.used_parameters) :
		if spec and spec.has_output() :
			all_conditions.update(spec.used_parameters)
	try :
		query_conditions = [Q((key, value)) for key, value in all_conditions.items()]
		queryset = queryset.filter(reduce(operator.or_, query_conditions))
	except TypeError as e :
		pass
	request.GET = saved_req
	return queryset
