package org.example;
import static spark.Spark.*;
public class SparkWebServer {

    public static void main(String... args){
        port(getPort());
        get("collatz", (req,res) -> {String secuence = req.queryParams("value");
            return "{\n " +
                    "\n" +
                    "\"operation\": \"Collatz\", \n" +
                    "\n" +
                    "\"input\" : "+ secuence+", \n" + "\n" +
                    "\"output\" : \""+ Collatz.crearSecuencia(Integer.parseInt(secuence)) + "\"\n" + "\n" + "}";
        });

    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}