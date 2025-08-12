def get_icon_path(extension, size = 32) :
	type_, encoding = mimetypes.guess_type('x.' + extension)
	if type_ :
		icon = gio.content_type_get_icon(type_)




def get_icon_path(extension, size=32):
    type_, encoding = mimetypes.guess_type('x.'+extension)
    if type_:
        icon = gio.content_type_get_icon(type_)
    else:
        icon = None
    return icon


