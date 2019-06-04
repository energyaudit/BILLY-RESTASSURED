package src.main.RestAssured;



        import static io.restassured.RestAssured.config;
        import static io.restassured.RestAssured.given;
        import static org.hamcrest.EasyMock2Matchers.equalTo;
        import static org.hamcrest.core.Is.is;

        import io.restassured.config.SSLConfig;
        import org.apache.http.HttpStatus;
        import org.junit.Test;

        import io.restassured.http.ContentType;
        import io.restassured.module.jsv.JsonSchemaValidator;

        public class SchemaVerify  {

                @Test
                public void SchemaValidationTest()

                {
                        org.apache.log4j.BasicConfigurator.configure();
                        String uri="https://jsonplaceholder.typicode.com/posts/1";
                        if(uri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }


                        given()
                                .accept(ContentType.JSON)
                                .when()
                                .get(uri)
                                .then()
                                .assertThat()
                                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemaFile.json"))
                              //  .statusCode(200);
                               .statusCode(is(HttpStatus.SC_OK));

                }

                @Test
                public void testDelete(){
                        org.apache.log4j.BasicConfigurator.configure();
                        String uri="https://jsonplaceholder.typicode.com/posts/1";
                        if(uri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }
                        given()
                                .when()
                                .delete("/1")
                                .then()
                                .header("Expires", equalTo("-1"));
                }
                @Test
                public void testAuth(){
                        org.apache.log4j.BasicConfigurator.configure();
                        String uri="http://restapi.demoqa.com/authentication/CheckForAuthentication";
                        if(uri.toLowerCase().contains("https")) { config = config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()); }
                        int code= given()
                                .auth().preemptive().basic("ToolsQA","TestPassword").when()
                                .get(uri).getStatusCode();
                        System.out.println(code);
                }

        }