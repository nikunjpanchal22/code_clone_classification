def remove_user(self, user) :
	if hasattr(user, "name") :
		self.remove(user.name)
	else :
		self.remove(user)


 def remove_user(self, user) :
    if user.__class__.__name__ == 'str' :
        self.remove(user)
    else :
        self.remove(user.name)


