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




def __init__(self, f, request, params, model, model_admin, field_path = None):
    super().__init__(f, request, params, model, model_admin, field_path)
    self.removes = {'Yes': ['amt__gt'], 'No': ['amt__exact'], 'All': ['amt__exact', 'amt__gt']}
    self.links = (('All', {}), ('Yes', {'amt__exact': 0}), ('No', {'amt__gt': 0}))
    self.ttl = 'Yes' if 'amt__exact' in request.GET else 'No' if 'amt__gt' in request.GET else 'All'


