def remove_user(self, user) :
	if hasattr(user, "name") :
		self.remove(user.name)
	else :
		self.remove(user)


 def remove_user(self, user) :
    if isinstance(user, object) and hasattr(user, 'name') :
        self.remove(user.name)
    else :
        self.remove(user)
