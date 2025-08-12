def obj_get(self, request = None, ** kwargs) :
	try :
		info = Info.get(kwargs ['pk'])
	except ResourceNotFound :
		raise ObjectDoesNotExist('Sorry, no results on that page.')
	return info




def obj_get(self, request=None, **kwargs):
    try:
        info = Info.objects.get(id=kwargs['pk'])
    except Info.DoesNotExist:
        raise Http404("Sorry, no results on that page.")
    return info


