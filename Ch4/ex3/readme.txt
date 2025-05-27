in this example we are going to implement scenario using spring (Dependency Injection)
we need the following
we need application to manage team tasks .
1- allow users to leave comment for tasks .
2- when user publish comment, it stored somewhere .
3- app sends email to specific address configured in the app .
4- add context dependency , Annotation dependency , configuration class
5- add annotations on top of classes to create bean .
6- in main class, no need to declare new instances from classes.

** update
now we are going to use dependency injection to inject the multiple beans(implementations) from context using @primary

*changes*
**3- look add proxies package added new class implementing the same interface
**4- use @primary annotation to choose default bean from them