package zcs.learning;

import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.http.HttpServer;

public class LearningTest {
    public static void main(String[] args) {
    Vertx vertx = Vertx.vertx(new VertxOptions().setWorkerPoolSize(2));
    HttpServer httpServer = vertx.createHttpServer();
    httpServer.requestHandler(reqest -> {
        System.out.print(reqest.uri());
        reqest.response().end("hi");
        }
    ).listen(8080, "127.0.0.1");

    }
}

