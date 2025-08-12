def remove_user(self, user) :
	if hasattr(user, "name") :
		self.remove(user.name)
	else :
		self.remove(user)



def remove_user(self, user):
    to_remove = user.name if 'name' in dir(user) else user
    self.remove(to_remove)


