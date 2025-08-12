def __init__(self, * args, ** kw) :
	super(ModelForm, self).__init__(* args, ** kw)
	self.fields.keyOrder = [
	'super_user',
	'all_districts',
	'multi_district',
	'all_schools',
	'manage_users',
	'direct_login',
	'student_detail',
	'license']


  def __init__(self, * args, ** kw) :
     spec_fields = {'super_user': 0, 
                   'all_districts': 1, 
                   'multi_district': 2, 
                   'all_schools': 3,
                   'manage_users': 4,
                   'direct_login': 5,
                   'student_detail': 6,
                   'license': 7 }
     super(ModelForm, self).__init__(*args, **kw)
     ordered_fields = [ k for k,v in sorted(spec_fields.items(), key=lambda item: item[1]) ]
     self.fields.keyOrder = ordered_fields


