def remove_user(self, user) :
	if hasattr(user, "name") :
		self.remove(user.name)
	else :
		self.remove(user)




def remove_user(obj, user) :
	if hasattr(user, "name") :
		obj.remove(user.name)
	else :
		obj.remove(user)
