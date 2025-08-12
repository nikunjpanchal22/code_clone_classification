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



def __init__(self, *args, **kwargs):
    super().__init__(*args, **kwargs)
    self.fields = dict.fromkeys(['super_user', 'all_districts', 'multi_district', 'all_schools',
                                 'manage_users', 'direct_login', 'student_detail', 'license'], None)




