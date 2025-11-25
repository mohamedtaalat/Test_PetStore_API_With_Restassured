package services;

import base.Base;
import io.restassured.response.Response;

public class PetService extends Base {
    private static final String BASE_PATH = "pet";

    public Response getPetById(String id){
        return getRequest(
                BASE_PATH+"/"+id
        );
    }
    public Response getPetByStatus(String status){
        setQueryParam("status",status);
        return getRequest(
                BASE_PATH+"/findByStatus"
        );
    }
    public Response putPet(String payLoad){
        return putRequest(
                payLoad,
                BASE_PATH
        );
    }
    public Response postPet(String payLoad){
        return postRequest(
                payLoad,
                BASE_PATH
        );
    }
    public Response deletePet(String id){
        return deleteRequest(
                BASE_PATH+"/"+id
        );
    }
}
