def __init__(self, f, request, params, model, model_admin, field_path = None) :
	super(IsFreePostage, self).__init__(f, request, params, model,
	model_admin, field_path)
	self.removes = {
	'Yes' : ['postage__gt'],
	'No' : ['postage__exact'],
	'All' : ['postage__exact', 'postage__gt']}
	self.links = (
	('All', {}),
	('Yes', {'postage__exact' : 0}),
	('No', {'postage__gt' : 0}))
	if request.GET.has_key('postage__exact') :
		self.ttl = 'Yes'
	elif request.GET.has_key('postage__gt') :
		self.ttl = 'No'
	else :
		self.ttl = 'All'




def __init__(self, f, request, params, model, model_admin, field_path = None) :
	super(IsFreePostage, self).__init__(f, request, params, model,
	model_admin, field_path)
	self.removes = {
	'Yes': ['postage__gte'],
	'No' : ['postage__lt'],
	'All' : ['postage__gte', 'postage__lt']}
	self.links = (
	('All', {}),
	('Yes', {'postage__gte' : 0}),
	('No', {'postage__lt' : 0}))
	if request.GET.has_key('postage__gte') :
		self.ttl = 'Yes'
	elif request.GET.has_key('postage__lt') :
		self.ttl = 'No'
	else :
		self.ttl = 'All'
