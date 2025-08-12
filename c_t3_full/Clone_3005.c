int main (int argc, char *argv []) {
    (void) argc, (void) argv;
    static uint8_t buffer [WIDTH * HEIGHT * 3];
    _Bool ok = init_app ("SDL example", NULL, SDL_INIT_VIDEO) && SDL_SetVideoMode (WIDTH, HEIGHT, 24, SDL_HWSURFACE);
    assert (ok);
    SDL_Surface *data_sf = SDL_CreateRGBSurfaceFrom (init_data (buffer), WIDTH, HEIGHT, 24, WIDTH *3, mask32 (0), mask32 (1), mask32 (2), 0);
    SDL_SetEventFilter (filter);
    for (; process (buffer); SDL_Delay (10))
        render (data_sf);
    return 0;
}





#include <SDL/SDL.h>
#define WIDTH 640
#define HEIGHT 480
int main(int argc, char *argv[])
{
    (void)argc, (void)argv;
    static uint8_t buffer[WIDTH * HEIGHT * 3];
    _Bool ok = init_app("SDL example", NULL, SDL_INIT_VIDEO) && SDL_SetVideoMode(WIDTH, HEIGHT, 24, SDL_HWSURFACE);
    if(!ok) return 1;
    
    SDL_Surface* srf = SDL_CreateRGBSurfaceFrom(init_data(buffer), WIDTH, HEIGHT, 24, WIDTH*3, mask32(0), mask32(1), mask32(2), 0);
    SDL_SetEventFilter (filter);

    while (process(buffer))
    {
        SDL_Delay(10);
        render(srf);
    }
    return 0;
}


