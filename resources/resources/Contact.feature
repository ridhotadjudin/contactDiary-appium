#Author: your.email@your.domain.com


@tag
Feature: User Account


  @tag2
  Scenario Outline: Membuat user account baru
    Given User berada di halaman Main Menu
    When User membuat account baru dengan menekan tombol add new account
    And User memasukkan nama <username>
    And User memasukkan start date
    And User memasukkan end date
    And User memasukkan telepon
    And User memasukkan relative
    And User memasukkan encounterType
    And User memasukkan prevention
    And User memasukkan notes
    Then User menekan tombol centang
    And User kembali ke menu utama dengan informasi user baru

  @tag1
  Scenario Outline: Title of your scenario outline
   Given User berada di halaman Main Menu
    When User membuat account baru dengan menekan tombol add new account
    And User memasukkan nama <nama>
    And User memasukkan telepon <telepon>
    Then User menekan tombol centang
    And User kembali ke menu utama dengan informasi user baru

    Examples: 
      | nama  | telepon |
      | dori  | 0821212 | 
      | rido  | 0898989 | 
