def remove_user(self, user) :
	if hasattr(user, "name") :
		self.remove(user.name)
	else :
		self.remove(user)


 def remove_user(self, user) :
    if not isinstance(user, str) :
        self.remove(user.name)
    else :
        self.remove(user)
