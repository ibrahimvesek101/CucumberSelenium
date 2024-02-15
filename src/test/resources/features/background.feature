Feature: Background Kullanımı

   Background: Tum senaryolar için çalışacak stepler.
    Given Kullanıcı google.com sayfasındadır.



  Scenario: Google amazon sezrch test
      # Given Kullanıcı google.com sayfasındadır.
    When Kullanıcı arama kısmına amazon yazar.
    And Kullanıcı aramayı gerçekleştirdiğinde
    Then Kullanıcı title kısmında amazon görmelidir.

    Scenario:
      # Given Kullanıcı google.com sayfasındadır.
      When Kullanıcı arama kısmına linkedin yazar.
      And Kullanıcı aramayı gerçekleştirdiğinde
      Then Kullanıcı title kısmında linkedin görmelidir.

