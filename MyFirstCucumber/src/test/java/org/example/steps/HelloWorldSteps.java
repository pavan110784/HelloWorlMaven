package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelloWorldSteps {

    @Given("^I am running this test$")
    public void runTest() {
        System.out.println("Test running in default step test");
    }
    @When("^All plugins are installed properly$")
    public void pluginsInstalled() {
        System.out.println("Plugins are installed");
    }
    @Then("^A Hello World greeting is an output$")
    public void helloWorldGreeting() {
        System.out.println("Hello World!");
    }
    @And("^The last line is Hi World$")
    public void lastLineHiWorld() {
        System.out.println("Hi World!");
    }
    @And("^The last line is Hello World$")
    public void lastLineHelloWorld() {
        System.out.println("Hello World!");
    }
}
