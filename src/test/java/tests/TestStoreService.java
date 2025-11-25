package tests;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import services.StoreService;

public class TestStoreService {
    @Test
    public void getStoreInventory(){
        StoreService storeService = new StoreService();
        Response response = storeService.getStoreInventory();
        System.out.println(response.asPrettyString());
    }
    @Test
    public void getOrderById(){
        StoreService storeService = new StoreService();
        Response response = storeService.getOrderById("2");
        System.out.println(response.asPrettyString());
    }
    @Test
    public void createOrder(){
        StoreService storeService = new StoreService();
        Response response = storeService.postOrder("{\n" +
                "  \"id\": 2,\n" +
                "  \"petId\": 9223372036854775424,\n" +
                "  \"quantity\": 2,\n" +
                "  \"shipDate\": \"2025-11-25T10:45:21.613Z\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true\n" +
                "}");
        System.out.println(response.asPrettyString());
    }

}
