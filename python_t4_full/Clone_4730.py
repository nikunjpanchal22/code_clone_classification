def remove_user(self, user) :
	if hasattr(user, "name") :
		self.remove(user.name)
	else :
		self.remove(user)



def remove_user(self, user):
    if "name" in user.__dict__:
        self.remove(user.name)


