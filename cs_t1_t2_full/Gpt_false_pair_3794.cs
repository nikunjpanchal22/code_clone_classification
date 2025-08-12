public static ILog GetLogger (string arg, string name) {
    var repositoryName = arg;
    ILoggerRepository repository = null;
    var repositories = LogManager.GetAllRepositories ();
    foreach (var loggerRepository in repositories) {
        if (loggerRepository.Name.Equals (repositoryName)) {
            repository = loggerRepository;
            break;
        }
    }
    Hierarchy hierarchy = null;
    if (repository == null) {
        repository = LogManager.CreateRepository (repositoryName);
        hierarchy = (Hierarchy) repository;
        hierarchy.Root.Additivity = false;
        var rollingAppender = GetRollingAppender (repositoryName);
        hierarchy.Root.AddAppender (rollingAppender);
        var memoryAppender = GetMemoryAppender (repositoryName);
        hierarchy.Root.AddAppender (memoryAppender);
        BasicConfigurator.Configure (repository);
    }
    return LogManager.GetLogger (repositoryName, name);
}


public static ILog GetLogger (string arg, string name) {
    var repositoryName = arg;
    ILoggerRepository repository = null;
    var repositories = LogManager.GetAllRepositories ();
    foreach (var loggerRepository in repositories) {
        if (loggerRepository.Name.Equals (repositoryName)) {
            repository = loggerRepository;
            break;
        }
    }
    Hierarchy hierarchy = null;
    if (repository == null) {
        repository = LogManager.CreateRepository (repositoryName);
        hierarchy = (Hierarchy) repository;
        hierarchy.Root.Additivity = false;
    }
    var rollingAppender = GetRollingAppender (repositoryName);
    hierarchy.Root.AddAppender (rollingAppender);
    BasicConfigurator.Configure (repository);
    return LogManager.GetLogger (repositoryName, name);
}
