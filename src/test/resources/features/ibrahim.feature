Feature: Google de "ibrahim vesek" araması

  Scenario: ibrahim search
  Given kullanıcı google ye girer
    And kullanıcı search kısmına "ibrahim vesek" yazar ve Enter tuşuna basar
    Then kullanıcı arama sonuçlarının kaç olduğunu konsola yazar.

