Feature: Navigation bar 
    To see the subpages of the website
    Whithout login in
    I can click on the navigation bar links

#Este escenario outline se usa para probar la navegación en los diferentes links de la página al mismo tiempo.
    #Scenario Outline: I can acces the subpages through the navigation bar
     #   Given I navigate to www.freerangetesters.com
      #  When I go to <section> using the navigation bar
       # Examples:
        #    | section   |
         #   | Cursos    |
          #  | Recursos  |
           # | Blog      |
            #| Mentorías |
            #| Udemy     |
            #| Academia  |            
       
    Scenario: Cousers are presented correctly to potential customers
        Given I navigate to www.freerangetesters.com
        When I go to Cursos using the navigation bar
        Then select Introducción al testing 


