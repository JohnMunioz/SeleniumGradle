@Navigation
Feature: Navigation bar 
    To see the subpages of the website
    Whithout login in
    I can click on the navigation bar links

    Background: I am on the FreeRangeTesters page without login
        Given I navigate to www.freerangetesters.com
    
#Este escenario outline se usa para probar la navegación en los diferentes links de la página al mismo tiempo.
    Scenario Outline: I can acces the subpages through the navigation bar
        When I go to <section> using the navigation bar

        Examples:
            | section   |
            | Cursos    |
            | Recursos  |
            | Blog      |
            | Mentorías |
            | Udemy     |
            | Academia  |      

    @Courses
    Scenario: Cousers are presented correctly to potential customers
        When I navigate specifically to Cursos using the navigation bar
        And I select Introducción al Testing

    @Plans @Courses
    Scenario: Users can select a plan when signing up
        When The client select Elegir Plan
        Then The client can validate the options in the checkout page

   
   
