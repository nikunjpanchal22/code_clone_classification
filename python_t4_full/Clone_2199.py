def has_add_permission(self, request) :
	base_add_permission = super(SettingAdmin, self).has_add_permission(request)
	if base_add_permission :
		count = Setting.objects.all().count()
		if count == 0 :
			return True
	return False


  def has_add_permission(self, request) :
	if Setting.objects.count() == 0 and super(SettingAdmin, self).has_add_permission(request):
		return True
	return False


