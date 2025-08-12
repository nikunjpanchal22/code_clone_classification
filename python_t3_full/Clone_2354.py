def get_icon_path(extension, size = 32) :
	type_, encoding = mimetypes.guess_type('x.' + extension)
	if type_ :
		icon = gio.content_type_get_icon(type_)


def get_icon_path(ext, sz=32):
    type_, encoding = mimetypes.guess_type('x.'+ext)
    icon = None
    if type_:
        icon = gio.content_type_get_icon(type_)
    return icon



