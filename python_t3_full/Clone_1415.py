def remove_user(self, user) :
	if hasattr(user, "name") :
		self.remove(user.name)
	else :
		self.remove(user)


 def remove_user(self, user) :
    try :
        self.remove(user.name)
    except AttributeError :
        self.remove(user)


