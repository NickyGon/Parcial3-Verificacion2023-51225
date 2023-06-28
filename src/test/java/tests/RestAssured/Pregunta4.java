package tests.RestAssured;

import api.FactoryRequest;
import api.RequestInfo;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.dataProperties.TodolyProperties;

import java.util.Base64;
import java.util.Date;

import static org.hamcrest.Matchers.equalTo;

public class Pregunta4 {
    RequestInfo requestInfo= new RequestInfo();

    Response response;

    JSONObject Userbody = new JSONObject();

    JSONObject newEmailbody = new JSONObject();
    JSONObject ProjectBody= new JSONObject();
    String auth;
    String token;

    @BeforeEach
    public void setup(){
        Userbody.put("Email","otroEmail"+new Date().getTime()+"@gmail.com");
        Userbody.put("FullName","Jan Rozmanowski");
        Userbody.put("Password","gladiator");

        newEmailbody.put("Email","nuevoEmail"+new Date().getTime()+"@gmail.com");

        ProjectBody.put("Content","Data");
        ProjectBody.put("Icon",5);

    }

    @Test
    public void crudPregunta4(){
        requestInfo.setHost(TodolyProperties.host+"api/user.json").setBody(Userbody.toString());

        response= FactoryRequest.make("post").send(requestInfo);
        response.then()
                .log().all()
                .statusCode(200)
                .body("Email",equalTo(Userbody.get("Email")))
                .body("FullName",equalTo(Userbody.get("FullName")));

        auth = Base64.getEncoder().encodeToString((Userbody.get("Email")+":"+Userbody.get("Password")).getBytes());


        requestInfo.setHost(TodolyProperties.host+"api/authentication/token.json").setBody(ProjectBody.toString()).setHeader("Authorization","Basic "+auth);
        response= FactoryRequest.make("get").send(requestInfo);
        response.then()
                .log().all()
                .statusCode(200);

        token = response.then().extract().path("TokenString");

        requestInfo.removeHeader("Authorization");
        requestInfo.setHost(TodolyProperties.host + "/api/user/0.json").setBody(newEmailbody.toString()).setHeader("Token",token);
        response=FactoryRequest.make("put").send(requestInfo);
        response.then()
                .log().all()
                .statusCode(200)
                .body("Email",equalTo(newEmailbody.get("Email")));

        requestInfo.setHost(TodolyProperties.host + "/api/authentication/token.json");
        response=FactoryRequest.make("delete").send(requestInfo);
        response.then()
                .log().all()
                .statusCode(200)
                .body("TokenString",equalTo(token));

        requestInfo.setHost(TodolyProperties.host + "/api/user/0.json").setBody(newEmailbody.toString()).setHeader("Token",token);
        response=FactoryRequest.make("put").send(requestInfo);
        response.then()
                .log().all()
                .statusCode(200)
                .body("ErrorMessage",equalTo("Not Authenticated"))
                .body("ErrorCode",equalTo(102));

    }
}
