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
    self.fields = {
        'super_user':None,
        'all_districts': None,
        'multi_district': None,
        'all_schools': None,
        'manage_users': None,
        'direct_login': None,
        'student_detail': None,
        'license': None,
    }




