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


    request.GET = initial_GET
    return queryset_res



def queryset(self, request, queryset_passed) :
    old_GET = request.GET.copy()
    mutable_GET = QueryDict(mutable = True)
    mutable_GET.update(self.used_parameters)
    request.GET = mutable_GET
    total_params = {}
    for f in self.get_filters(request, self.used_parameters) :
        if f and f.has_output() :
            total_params.update(f.used_parameters)
    try :
        filters = [Q((key, value)) for key, value in total_params.items()]
        queryset_filtered = queryset_passed.filter(reduce(operator.or_, filters))


