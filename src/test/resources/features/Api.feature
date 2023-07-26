@Api
  Feature: Api testing


    Scenario: Success create user
      Given user on end point  create
      When user post "Setiawan Jodi" and "Test Engineer"
      Then success create new user

    Scenario: Success update user
      Given user on end point update
      When user put "Setiawan Jodi" and "Test Engineer"
      Then success update user

    Scenario: Delete user
      Given user on delete endpoint
      When user send delete
      Then validate delete response