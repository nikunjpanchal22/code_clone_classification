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
	preserved_GET = request.GET.copy()
	alterable_GET = QueryDict(mutable = True)
	alterable_GET.update(self.used_parameters)
	request.GET = alterable_GET
	all_requirements = {}
	for item in self.get_filters(request, self.used_parameters) :
		if spec and spec.has_output() :
			all_requirements.update(spec.used_parameters)
	try :
		query_elements = [Q((key, value)) for key, value in all_requirements.items()]
		queryset = queryset.filter(reduce(operator.or_, query_elements))
	except TypeError as e :
		pass
	request.GET = preserved_GET
	return queryset
