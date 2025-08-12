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
     super(ModelForm, self).__init__(*args, **kw)
     ordered_fields = sorted(['super_user', 'multi_district', 'all_districts', 'all_schools'], key=lambda x: x) + ['manage_users', 'direct_login', 'license', 'student_detail']
     self.fields.keyOrder = ordered_fields


