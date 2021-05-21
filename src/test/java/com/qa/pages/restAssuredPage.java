package com.qa.pages;

import com.qa.stepdef.Hooks;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class restAssuredPage extends Hooks {

    public restAssuredPage(){
        this.wdriver = wdriver;
    }
   public static String url=null;
    String id ="10";

    public void setUrl(String url) {
        this.url = url;
    }

    public void verifystatuscode(int statcode){
       int statuscode = given().when().get(url).getStatusCode();
      System.out.println("status code is " + statuscode);
        Assert.assertTrue(statuscode==statcode);
    }


    public void getfirstname(String fname){
        String firstName = null;
        for(int i=0;i<=5;i++){

            if((given().when().get(url).then().extract().path("data["+i+"].id")).toString().equalsIgnoreCase(id)){

                 firstName =  given().when().get(url).then().extract().path("data["+i+"].first_name");
                System.out.println(firstName);
                Assert.assertTrue(firstName.equalsIgnoreCase(fname));

            }

        }

    }

    public void postApiStatusCode(int statcode){
        String payload = "{\n" +
                        "\"name\":\"Bryant\",\n" +
                        "\"job\":\"BA\"\n" +
                        " }";

       int statuscode =  given().contentType(ContentType.JSON)
                .body(payload)
                .post(url)
                .getStatusCode();
        Assert.assertTrue(statuscode==statcode);


    }

    public void verifynewidcreated(){
        String payload = "{\n" +
                "\"name\":\"Bryant\",\n" +
                "\"job\":\"BA\"\n" +
                " }";

        String newid =  given().contentType(ContentType.JSON)
                .body(payload)
                .post(url)
                .then().log().body().extract().path("id");
        System.out.println(newid);


    }

}
