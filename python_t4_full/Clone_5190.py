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


            all_outputs.update(filterarg.used_parameters)
    try :
        all_keys_and_values = [Q((key, value)) for key, value in all_outputs.items()]
        modified_queryset = queryset_input.filter(reduce(operator.or_, all_keys_and_values))
    except TypeError as te:
        pass
    request.GET = source_get
    return modified_queryset



def queryset(self, request, queryset_ref) :
    get_data = request.GET.copy()
    manipulated_get = QueryDict(mutable=True)
    manipulated_get.update(self.used_parameters)
    request.GET = manipulated_get


