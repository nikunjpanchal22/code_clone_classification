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
    cl_context_properties cps[2] = {CL_CONTEXT_PLATFORM, reinterpret_cast<cl_context_properties>(platform), 0};
    cl_context context = clCreateContextFromType (cps, CL_DEVICE_TYPE_ALL, 0, 0, &e);
    if (e)
        exit (e);
    cl_command_queue queue = clCreateCommandQueueWithProperties (context, device, 0, &e);
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
    e = clEnqueueNDRangeKernel(queue, kernel, 1, 0, 0, 0, 0, 0, 0);
    if (e)
        exit (e);
}	

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
    cl_context context = clCreateContext (NULL, 1, &device, NULL, NULL, &e);
    if (e)
        exit (e);
    cl_command_queue queue = clCreateCommandQueue (context, device, 0, &e);
    if (e)
        exit (e);
    cl_program program = clCreateProgramWithSource (context, argc, (const char **) argv, NULL, &e);
    cl_kernel kernel = 0;
    if (e)
        exit (e);
    e = clBuildProgram (program, 1, &device, NULL, NULL, NULL);
    if (e)
        exit (e);
    e = clCreateKernelsInProgram (program, 1, &kernel, NULL);
    if (e)
        exit (e);
    e = clSetKernelArg (kernel, 0, sizeof (int), &argc);
    if (e)
        exit (e);
    size_t global_work_size[1] = {1};
    e = clEnqueueNDRangeKernel(queue, kernel, 1, NULL, global_work_size, NULL, 0, NULL, NULL);
    if (e)
        exit (e);
}	

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
    cl_context_properties cps[2] = {CL_CONTEXT_PLATFORM, reinterpret_cast<cl_context_properties>(platform), 0};
    cl_context context = clCreateContext (cps, 1, &device, NULL, NULL, &e);
    if (e)
        exit (e);
    cl_command_queue queue = clCreateCommandQueue (context, device, 0, &e);
    if (e)
        exit (e);
    cl_program program = clCreateProgramWithSource (context, argc, (const char **) argv, NULL, &e);
    cl_kernel kernel = 0;
    if (e)
        exit (e);
    e = clBuildProgram (program, 1, &device, NULL, NULL, NULL);
    if (e)
        exit (e);
    e = clCreateKernelsInProgram (program, 1, &kernel, NULL);
    if (e)
        exit (e);
    e = clSetKernelArg (kernel, 0, sizeof (int), &argc);
    if (e)
        exit (e);
    size_t global_work_size[1] = {1};
    e = clEnqueueTask (queue, kernel, 0, NULL, NULL);
    if (e)
        exit (e);
}
