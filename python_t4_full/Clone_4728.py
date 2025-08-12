def remove_user(self, user) :
	if hasattr(user, "name") :
		self.remove(user.name)
	else :
		self.remove(user)


def remove_user(self, user):
    key = user.name if isinstance(user, type) and "name" in user.__dict__ else user
    self.remove(key)




