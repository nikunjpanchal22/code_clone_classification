def changelist_view(self, request, extra_context = None) :
	test = request.META ['HTTP_REFERER'].split(request.META ['PATH_INFO'])
	if test [- 1] and not test [- 1].startswith('?') :
		if not request.GET.has_key('decommissioned__exact') :
			q = request.GET.copy()
			q ['decommissioned__exact'] = 'N'
			request.GET = q
			request.META ['QUERY_STRING'] = request.GET.urlencode()
	return super(MyModelAdmin, self).changelist_view(request, extra_context = extra_context)




 
def changelist_view(self, request, extra_context = None) :
    test = request.META.get('HTTP_REFERER', '').split(request.META.get('PATH_INFO', ''))
    if test and test[-1] and not test[-1].startswith('?') :
        request.GET._mutable = True
        request.GET.setdefault('decommissioned__exact', 'N')
        request.GET._mutable = False
        request.META['QUERY_STRING'] = request.GET.urlencode()


