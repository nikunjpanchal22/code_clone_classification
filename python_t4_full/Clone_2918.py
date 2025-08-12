def obj_get(self, request = None, ** kwargs) :
	try :
		info = Info.get(kwargs ['pk'])
	except ResourceNotFound :
		raise ObjectDoesNotExist('Sorry, no results on that page.')
	return info



  def obj_get(self, request = None, **kwargs):
    info_list = Info.objects.filter(**kwargs)
    if not info_list:
        raise ObjectDoesNotExist('Sorry, no results on that page.')


