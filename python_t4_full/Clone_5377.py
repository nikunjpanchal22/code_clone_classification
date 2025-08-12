def obj_get(self, request = None, ** kwargs) :
	try :
		info = Info.get(kwargs ['pk'])
	except ResourceNotFound :
		raise ObjectDoesNotExist('Sorry, no results on that page.')
	return info



def obj_get(self, request=None, **kwargs):
    info = Info.objects.get_or_none(pk=kwargs['pk'])
    if not info:
        raise ObjectDoesNotExist('Sorry, no results on that page.')
    return info




