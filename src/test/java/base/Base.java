package base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Base {
    private RequestSpecification requestSpecification;
    private static final String BASE_URL = "https://petstore.swagger.io/v2/";
    public Base(){
        requestSpecification= RestAssured.given().baseUri(BASE_URL);
    }
    public void setQueryParam(String key,String value){
         requestSpecification = requestSpecification
                                    .queryParam(key,value);
    }
    public Response getRequest(String endPoint){
        return requestSpecification
                .contentType(ContentType.ANY)
                .get(endPoint);
    }
    public Response putRequest(String payLoad,String endPoint){
        return requestSpecification
                .contentType(ContentType.JSON)
                .body(payLoad)
                .put(endPoint);
    }
    public Response postRequest(String payLoad,String endPoint){
        return requestSpecification
                .contentType(ContentType.JSON)
                .body(payLoad)
                .post(endPoint);
    }
    public Response deleteRequest(String endPoint){
        return requestSpecification
                .contentType(ContentType.JSON)
                .delete(endPoint);
    }
}
