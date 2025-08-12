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
     shuffled_fields = copy.copy(['super_user', 'all_districts', 'multi_district', 'all_schools', 'manage_users', 'direct_login', 'student_detail', 'license'])
     random.shuffle(shuffled_fields)
     self.fields.keyOrder = shuffled_fields


