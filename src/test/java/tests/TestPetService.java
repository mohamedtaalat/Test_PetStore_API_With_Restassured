package tests;

import io.restassured.response.Response;
import junit.framework.Assert;
import models.PetResponse;
import org.junit.jupiter.api.Test;
import services.PetService;

public class TestPetService {
    @Test
    public void getPetById(){
        PetService petService = new PetService();
        Response response = petService.getPetById("9223372036854775424");
        System.out.println(response.asPrettyString());

    }
    @Test
    public void getPetByStatus(){
        PetService petService = new PetService();
        Response response = petService.getPetByStatus("available");
        System.out.println(response.asPrettyString());
    }
    @Test
    public void updatePet(){
        PetService petService = new PetService();
        Response response = petService.putPet("     {\n" +
                "            \"id\": 9223372036854775424,\n" +
                "                \"category\": {\n" +
                "            \"id\": 0,\n" +
                "                    \"name\": \"string\"\n" +
                "        },\n" +
                "            \"name\": \"hussein\",\n" +
                "                \"photoUrls\": [\n" +
                "            \"string\"\n" +
                "        ],\n" +
                "            \"tags\": [\n" +
                "            {\n" +
                "                \"id\": 0,\n" +
                "                    \"name\": \"string\"\n" +
                "            }\n" +
                "        ],\n" +
                "            \"status\": \"available\"\n" +
                "        }");
        System.out.println(response.asPrettyString());
    }
    @Test
    public void addPet(){
        PetService petService = new PetService();
        Response response = petService.postPet("     {\n" +
                "            \"id\": 5,\n" +
                "                \"category\": {\n" +
                "            \"id\": 0,\n" +
                "                    \"name\": \"hello\"\n" +
                "        },\n" +
                "            \"name\": \"hussein\",\n" +
                "                \"photoUrls\": [\n" +
                "            \"string\"\n" +
                "        ],\n" +
                "            \"tags\": [\n" +
                "            {\n" +
                "                \"id\": 0,\n" +
                "                    \"name\": \"string\"\n" +
                "            }\n" +
                "        ],\n" +
                "            \"status\": \"available\"\n" +
                "        }");
        System.out.println(response.asPrettyString());
    }
    @Test
    public void deletePet(){
        PetService petService = new PetService();
        Response response = petService.deletePet("257152");
        System.out.println(response.asPrettyString());
    }

}
