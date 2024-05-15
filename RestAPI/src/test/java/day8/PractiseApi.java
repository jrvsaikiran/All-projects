package day8;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import lombok.Data;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@Data
public class PractiseApi {
    String id;
    String name;
    int number;

    @Test
    public void pojo2Json() throws JsonProcessingException {
        PractiseApi pojo = new PractiseApi();
        pojo.setId("sai");
        pojo.setName("kiran");
        pojo.setNumber(8);

      ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(pojo);
        System.out.println("Serilization = pojo to json"+json);
    }

    @Test
    public void json2Pojo() throws JsonProcessingException {
        String jsn =  "{\r\n" +
                "  \"id\" : \"kiran@gmail.com\",\r\n" +
                "  \"name\" : \"jrv\",\r\n" +
                "  \"number\" : \78\",\r\n" +
                "  \"avatar\" : \"https://reqres.in/img/faces/7-image.jpg\"\r\n" +
                "}";

        ObjectMapper OM = new ObjectMapper();
        PractiseApi pojoObj = OM.readValue(jsn, PractiseApi.class);
        String id = pojoObj.getId();
        String name = pojoObj.getName();
        System.out.println(id+name);
    }

    @Test
    public void postByHashMap(){
        Map<String ,String > map = new HashMap<String, String>();
        map.put("id","89");
        map.put("cell","9097689");

        String token = "gdy683jyd6hye8";
        given()
                .header("Authorization","Bearer"+token )
//                .auth().basic("username","password")
//                .auth().digest("","")
//                .auth().oauth("","","")
                .contentType("application/json")
                .pathParam("mypath","id")
                .queryParam("state","AP")
                .body(map)
        .when()
                .post("https://reqres.in/api/{mypath}")
        .then()
                .statusCode(200)
                .body("id.application[2]",equalTo("sai"))
                .header("Content-Type",equalTo("Content-Type;charset=utf-8"))
                .body("authenticated", equalTo(true))   //to check autentication
                .cookie("AEC",equalTo("ARblvhaFy8WIhFQ"))
                .log().body()
                .log().headers()
                .log().cookies()
                .log().everything()
                .log().status()
                .log().ifStatusCodeIsEqualTo(200)
                .log().all()

                //JsonSchemaValidator - validate data types like string,int,boolan
                .assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("jsonschemavalidation.json"))
                //xmlSchemaValidator- validate data types like string,int,boolan
                .assertThat().body(RestAssuredMatchers.matchesXsdInClasspath("xmlvalidator.xsd"));
     }


    @Test
    public void postByPOJO(){
        PractiseApi pojo = new PractiseApi();
        pojo.setId("sai");
        pojo.setName("kiran");
        pojo.setNumber(8);

        String token = "yrh7";
        Response res = given()
                .header("Authorization", "Bearer"+token)
                .contentType("application/json")
                .body(pojo)
                .when()
                .post("");

          //validations by testng-asserts
        Assert.assertEquals(res.getStatusCode(),"200");
        Assert.assertEquals(res.body().jsonPath().getInt("id"),"sai");
        Assert.assertEquals(res.header("Content-Type"),"application/json; charset=utf-8");
        Assert.assertEquals(res.jsonPath().get("id.app[2].email").toString(),"sai@gmail,com");

        //validation in arrays
        JSONObject jo = new JSONObject(res.toString());

        //type1
        String schoolname = jo.getJSONArray("schools").getJSONObject(2).get("name").toString();

        //type2-iteration array
        for(int i=0 ; i<jo.getJSONArray("student").length(); i++){
            String studentName = jo.getJSONArray("student").getJSONObject(i).get("name").toString();
            System.out.println(studentName);
        }
    }

    @Test
    public void postByJsonObject(){
        JSONObject jsOb = new JSONObject();
        jsOb.put("name","sai");
        jsOb.put("id","45");

       Response resp =  given()
                .contentType("appliaction/json")
                .body(jsOb.toString())
                .when()
                .post("http://");

       //headers
        Headers headers = resp.getHeaders();
        for (Header hed:headers ) {
            System.out.println(hed);
        }

        //cookies
        Map<String, String> cookies = resp.getCookies();
       for(Map.Entry<String,String> cok : cookies.entrySet()){
           System.out.println(cok.getKey()+"======="+cok.getValue());
       }
    }


}
