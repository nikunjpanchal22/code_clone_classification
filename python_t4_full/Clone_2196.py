def has_add_permission(self, request) :
	base_add_permission = super(SettingAdmin, self).has_add_permission(request)
	if base_add_permission :
		count = Setting.objects.all().count()
		if count == 0 :
			return True
	return False


  def has_add_permission(self, request) :
	a = True if Setting.objects.all().count() == 0 else False
	b = super(SettingAdmin, self).has_add_permission(request)
	return a and b


