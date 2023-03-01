@Login
  Feature: Login

    @ValidLogin
    Scenario: Como usuario, puedo entrar al area segura con credenciales validas.
      Given user se encuentra en la pagina de login
      When user inicia sesion con credenciales validas
      Then user visualiza un mensaje de inicio de sesion valida

    @InvalidLogin
    Scenario: Como usuario, no puedo entrar al area segura con credenciales invalidas.
      Given user se encuentra en la pagina de login
      When user intenta iniciar sension con credenciales invalidas
      Then user visualiza un mensaje de inicio de sesion fallido
