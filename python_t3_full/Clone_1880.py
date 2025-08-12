def obj_get(self, request = None, ** kwargs) :
	try :
		info = Info.get(kwargs ['pk'])
	except ResourceNotFound :
		raise ObjectDoesNotExist('Sorry, no results on that page.')
	return info


#gpt output=============
 def obj_get(self, request = None, ** kwargs) :
	try :
		info = Info.objects.filter(**kwargs).first()
	except ResourceNotFound :
		raise ObjectDoesNotExist('Sorry, no results on that page.')


