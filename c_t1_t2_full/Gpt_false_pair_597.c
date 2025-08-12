void main () {
    figure_t figures [NUM_FIGURES] = {make_rect (0, 0, 40, 40), make_elipse (256, 128, 80, 40),
    }
    for (uint32_t x = 0; x < width; ++x) {
        for (uint32_t y = 0; y < height; ++x) {
            for (uint32_t figure_ii = 0; figure_ii < NUM_FIGURES; ++figure_ii) {
                if (figures[figure_ii]->is_pixel_belongs (x, y)) {
                    image[x][y] = 1;
                    break;
                }
            }
        }
    }
}


 void main () {
    Primitives figures [NUM_PRIMS] = {construct_rectangle (0, 0, 40, 40), construct_elipse (256, 128, 80, 40),
    }
    for (uint32_t x = 0; x < width; ++x) {
        for (uint32_t y = 0; y < height; ++x) {
            for (uint32_t prim_ii = 0; prim_ii < NUM_PRIMS; ++prim_ii) {
                if (figures[prim_ii]->location_contains (x, y)) {
                    image[x][y] = 1;
                    break;
                }
            }
        }
    }
}
