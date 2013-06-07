Spring Java config exemple *for library writers*
================================================

How to help your library's users by enforcing what they have to provide
-----------------------------------------------------------------------

* Why this 'proof of concept' ?
When you write a library (not an application) aiming to be used by some devs, they usually have
to provide some input to the library. It may be wrappers, handlers, managers etc...
But there may be a specific order in which those instances have to be provided because of the
dependencies. Or it may be through setters but the user may fail to set all the required fields...
This little POC demonstrate how to force the client to provide all the required fields and use
the power of Spring's Dependency Injection (here in Java in order to enforce the types, and to
test it because I'm used to XML).

* How does it work ?
** the library defines an interface "LibClientSpringConfig"
** the client code HAS TO implement this interface and let it be Spring managed (the simplest is to let it's @Configuration annotated context implement this interface)
** the client code HAS TO make the library's application Context ("MyLibSpringConfig" here) handle by Spring. Here it uses the @import annotation
** finally the library is injected an instance of the "LibClientSpringConfig" interface abd has everything it needs to fulfill its job 