package util;


import abilities.VerificarTitulo;
import exceptions.ExceptionHandler;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.core.environment.ConfiguredEnvironment;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


import java.util.Arrays;
import java.util.List;


public class Hooks extends ConfiguredEnvironment {

    public static WebDriver driver;


/*
    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName).describedAs("Un usuario normal");
    }



    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    */

    @ParameterType("user|admin")
    public Actor actor(String name) {


        return OnStage.theActorCalled(name);


    }




        @Before
        public void setUp() throws Exception {

        /*
        //Obtener variables del archivo serenity.conf
        EnvironmentVariables variablesEntorno = ConfiguredEnvironment.getConfiguration().getEnvironmentVariables();
        //Url Base
        String baseUrl = ConfiguredEnvironment.getConfiguration().getBaseUrl();
        //Driver
        String driverType = variablesEntorno.getProperty("environments.default.webdriver.driver");
        //Modo de cabecera
        Boolean headlessMode = Boolean.valueOf(variablesEntorno.getProperty("headless.mode"));

            switch (driverType) {
                case "chrome":
                    //Crear opciones de Chrome
                    ChromeOptions chromeOptions = new ChromeOptions();

                    String driverChromeSwitches = variablesEntorno.getProperty("chrome.switches");
                    if(driverChromeSwitches != null && !driverChromeSwitches.isEmpty()) {
                        chromeOptions.addArguments(driverChromeSwitches.split(";"));
                    }
                    if(headlessMode) {
                        chromeOptions.addArguments("--headless");
                    }


                    driver = new ChromeDriver(chromeOptions);

                    break;

                case "edge":
                    EdgeOptions edgeOptions = new EdgeOptions();

                    String driverEdgeSwitches = variablesEntorno.getProperty("edge.switches");
                    if(driverEdgeSwitches != null && !driverEdgeSwitches.isEmpty()) {
                        edgeOptions.addArguments(driverEdgeSwitches.split(";"));
                    }
                    if(headlessMode) {
                        edgeOptions.addArguments("--headless");
                    }
                    driver = new EdgeDriver(edgeOptions);
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        */
        BrowseTheWeb browseTheWeb = BrowseTheWeb.with(driver);

        List<Ability> userAbilities = Arrays.asList(browseTheWeb, VerificarTitulo.en(driver));


        OnStage.setTheStage(new OnlineCast());
        ActorFactory.crearYRegistrarActor("user", "Usuario de prueba", userAbilities);

    }


    /*

    @After
    public void tearDown() {
        driver.quit();

    }

     */




}
