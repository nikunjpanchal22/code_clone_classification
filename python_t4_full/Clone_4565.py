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


    cntxt.translate(pos[0], pos[1])
    cntxt.rotate(rot)
    cntxt.translate(new_x, new_y)
    cntxt.move_to(0, 0)
    cntxt.show_text(txt)
    cntxt.restore()


def put_text(ctxt, strt, p, t = 0.0, face = 'Georgia', sz = 18) :
    ctxt.save()
    ctxt.select_font_face(face, cairo.FONT_SLANT_NORMAL, cairo.FONT_WEIGHT_NORMAL)
    ctxt.set_font_size(sz)
    fa, fd, fh, fxa, fya = ctxt.font_extents()
    x_off, y_off, txt_w, txt_h = ctxt.text_extents(strt)[:4]


