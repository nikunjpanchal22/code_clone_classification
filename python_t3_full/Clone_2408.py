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


        pass
    request.GET = old_GET
    return queryset_filtered



def queryset(self, request, queryset_input) :
    previa_GET = request.GET.copy()
    mock_GET = QueryDict(mutable=True)
    mock_GET.update(self.used_parameters)
    request.GET = mock_GET
    all_particle = {}
    for fh in self.get_filters(request, self.used_parameters):
        if fh and fh.has_output():
            all_particle.update(fh.used_parameters)
    try :
        parameters = [Q((key, value)) for key, value in all_particle.items()]


