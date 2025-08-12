int main (int argc, char **argv) {
    cl_int e = 0;
    cl_platform_id platform = 0;
    cl_device_id device = 0;
    e = clGetPlatformIDs (1, &platform, 0);
    if (e)
        exit (e);
    e = clGetDeviceIDs (platform, CL_DEVICE_TYPE_ALL, 1, &device, 0);
    if (e)
        exit (e);
    cl_context context = clCreateContext (0, 1, &device, 0, 0, &e);
    if (e)
        exit (e);
    cl_command_queue queue = clCreateCommandQueue (context, device, 0, &e);
    if (e)
        exit (e);
    cl_program program = clCreateProgramWithSource (context, argc, (const char **) argv, 0, &e);
    cl_kernel kernel = 0;
    if (e)
        exit (e);
    e = clBuildProgram (program, 1, &device, 0, 0, 0);
    if (e)
        exit (e);
    e = clCreateKernelsInProgram (program, 1, &kernel, 0);
    if (e)
        exit (e);
    e = clSetKernelArg (kernel, 0, sizeof (int), &argc);
    if (e)
        exit (e);
    e = clEnqueueTask (queue, kernel, 0, 0, 0);
    if (e)
        exit (e);
}






main (int n, char **a) {
   cl_int x = 0;
   cl_platform_id p = 0;
   cl_device_id d = 0;
   x = clGetPlatformIDs (1, &p, 0); exit(x);
   x = clGetDeviceIDs (p, CL_DEVICE_TYPE_ALL, 1, &d, 0); exit(x);
   cl_context ctx = clCreateContext (0, 1, &d, 0, 0, &x); exit(x);
   cl_command_queue q = clCreateCommandQueue (ctx, d, 0, &x); exit(x);
   cl_program prog = clCreateProgramWithSource (ctx, n, (const char **) a, 0, &x);
   cl_kernel kern = 0; exit(x);
   x = clBuildProgram (prog, 1, &d, 0, 0, 0); exit(x);
   x = clCreateKernelsInProgram (prog, 1, &kern, 0); exit(x);
   x = clSetKernelArg (kern, 0, sizeof (int), &n); exit(x);
   x = clEnqueueTask (q, kern, 0, 0, 0); return x;
}


