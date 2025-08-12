def text(ctx, string, pos, theta = 0.0, face = 'Georgia', font_size = 18) :
	ctx.save()
	ctx.select_font_face(face, cairo.FONT_SLANT_NORMAL, cairo.FONT_WEIGHT_NORMAL)
	ctx.set_font_size(font_size)
	fascent, fdescent, fheight, fxadvance, fyadvance = ctx.font_extents()
	x_off, y_off, tw, th = ctx.text_extents(string) [: 4]
	nx = - tw / 2.0
	ny = fheight / 2
	ctx.translate(pos [0], pos [1])
	ctx.rotate(theta)
	ctx.translate(nx, ny)
	ctx.move_to(0, 0)
	ctx.show_text(string)
	ctx.restore()


    n_y = fh / 2
    ctxt.translate(p[0], p[1])
    ctxt.rotate(t)
    ctxt.translate(n_x, n_y)
    ctxt.move_to(0, 0)
    ctxt.show_text(strt)
    ctxt.restore()


def write_text(context, string, coordinates, angle = 0.0, fface = 'Georgia', fsize = 18):
    context.save()
    context.select_font_face(fface, cairo.FONT_SLANT_NORMAL, cairo.FONT_WEIGHT_NORMAL)
    context.set_font_size(fsize)
    ascent, descent, h, xa, ya = context.font_extents()


