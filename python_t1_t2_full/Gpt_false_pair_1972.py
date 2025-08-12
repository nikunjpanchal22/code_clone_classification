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
	saved_get_info = request.GET.copy()
	editable_get_info = QueryDict(mutable = True)
	editable_get_info.update(self.used_parameters)
	request.GET = editable_get_info
	all_criterias = {}
	for spec in self.get_filters(request, self.used_parameters) :
		if spec and spec.has_output() :
			all_criterias.update(spec.used_parameters)
	try :
		query_arguments = [Q((key, value)) for key, value in all_criterias.items()]
		queryset = queryset.filter(reduce(operator.or_, query_arguments))
	except TypeError as e :
		pass
	request.GET = saved_get_info
	return queryset
