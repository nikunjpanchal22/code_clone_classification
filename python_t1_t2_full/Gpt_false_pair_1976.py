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
	original_GET = request.GET.copy()
	mutable_GET = QueryDict(mutable = True)
	mutable_GET.update(self.used_parameters)
	request.GET = mutable_GET
	all_params = {}
	for selection in self.get_filters(request, self.used_parameters) :
		if selection and selection.has_output() :
			all_params.update(selection.used_parameters)
	try :
		query_args = [Q((key, value)) for key, value in all_params.items()]
		queryset = queryset.filter(reduce(operator.or_, query_args))
	except TypeError as e :
		pass
	request.GET = original_GET
	return queryset
