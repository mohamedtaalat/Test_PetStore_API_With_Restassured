package services;

import base.Base;
import io.restassured.response.Response;

public class StoreService extends Base {
    private static final String BASE_PATH = "store/";
    public Response getStoreInventory(){
        return getRequest(
                BASE_PATH+"inventory"
        );
    }
    public Response getOrderById(String id){
        return getRequest(
                BASE_PATH+"order/"+id
        );
    }
    public Response postOrder(String payLoad){
        return postRequest(
                payLoad,
                BASE_PATH+"order"
        );
    }

}
