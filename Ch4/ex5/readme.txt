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
we are going to use Stereo type annotation to specify every object responsibility and mark it as component

@Service -> with classes that used to implement use case, business logic, mark them as component .
@Repository -> with class that manage data persistence, mark them as component .
@Component -> generic annotation doesn't specify object responsibility .
-- used with (CommentService - DBCommentRepository) classes
-- why to use these annotations ?
to make code more readable, allow developers to understand application design .