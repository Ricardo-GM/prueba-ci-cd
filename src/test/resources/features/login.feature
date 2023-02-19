@Login
  Feature: Login

    @ValidLogin
    Scenario: Como usuario, puedo entrar al area segura con credenciales validas.
      Given Juan se encuentra en la pagina de login
      When Juan inicia sesion con credenciales validas
      Then Juan visualiza un mensaje de inicio de sesion valida

    @InvalidLogin
    Scenario: Como usuario, no puedo entrar al area segura con credenciales invalidas.
      Given Juan se encuentra en la pagina de login
      When Juan intenta iniciar sension con credenciales invalidas
      Then Juan visualiza un mensaje de inicio de sesion fallido
