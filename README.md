# 01-StudentApp
Student Details using Spring boot to demonstrate @ComponetScan @Component @Bean Annotation  
Analyze @component has higher priority in making spring bean object by the spring IOC container
compare to @Bean annotation which has low priority and executed and bean creation process is done after @component.

Execution starts from Application class main method()

Spring IOC container will create objects for those classes only which are in the main package, also subpackages annotated with @Component annotation 

Spring IOC container will not create objects for other packages or subpackagesother than main package even if they annotated with @Component annotation.

In order to make aware to IOC container about other packages mention package name in @ComponetScan annotation as

@ComponentScan(basePackages = "com.student.one","com.student.two")
