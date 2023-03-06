@Login
  Feature: Login

    @ValidLogin
    Scenario: Como usuario, puedo entrar al area segura con credenciales validas.
      Given Juan se encuentra en la pagina de login
      When Juan inicia sesion con credenciales validas
      Then Juan visualiza un mensaje de inicio de sesion valida

